grammar Vetrix;

@parser::members {
	java.util.Hashtable varMap = new java.util.Hashtable();
}

runProgram:(assign|number|print|calculateVectors|arythmVectors|vector)*;

assign returns [Double value]:	
	var=ID EQUALS (num=number{
		varMap.put($var.text, $num.value);
	}
	| vec=vector{
		varMap.put($var.text, $vec.values);
	}
	)
; 
	
PRINT_EXP: PRINT L_C_BR ID R_C_BR;
print : exp=PRINT_EXP {
		String varName = $exp.text.split("[\\(\\)]")[1];
		try{
			System.out.println((Double)varMap.get(varName));
			}
		catch(Exception ex){
			System.out.println((ArrayList)varMap.get(varName));
		}
	};

calculateVectors returns [List<Double> values]
	: exp=arythmVectors {$values = $exp.values;};    	

arythmVectors returns [List<Double> values]
	// Summarizes vectors. Eg: [1, 2, 3] + [4, 7.43, -5]
	:    (sum1 = vector {}
         ( PLUS sum2 = vector {
         	List<Double> vector1 = $sum1.values;
         	List<Double> vector2 = $sum2.values;
         	List<Double> summary = new ArrayList<Double>();
         	for(int i = 0; i < vector2.size(); i++){
         		summary.add(vector1.get(i) + vector2.get(i));
         	}
         	$values = summary;
         } 
         // Subtracts vectors. Eg: [1, 2, 3] - [4, 7.43, -5]
         |MINUS sum2 = vector {
         	List<Double> vector1 = $sum1.values;
         	List<Double> vector2 = $sum2.values;
         	List<Double> subtraction = new ArrayList<Double>();
         	for(int i = 0; i < vector2.size(); i++){
         		subtraction.add(vector1.get(i) - vector2.get(i));
         	}
         	$values = subtraction;
         } 
         // Multiplicates vectors. Eg: [1, 2, 3] * [4, 7.43, -5]
         | MULT sum2 = vector {
         	List<Double> vector1 = $sum1.values;
         	List<Double> vector2 = $sum2.values;
         	List<Double> summary = new ArrayList<Double>();
         	for(int i = 0; i < vector2.size(); i++){
         		summary.add(vector1.get(i) * vector2.get(i));
         	}
         	$values = summary;
         }
         // Multiplicates a vector and a number. Eg: [1, 2, 3] * 4
         | MULT sum3 = number {
         	List<Double> vector1 = $sum1.values;
         	Double number = $sum3.value;
         	//if(vector1.size() != vector2.size()){ throw new EmptyStackException(); }
         	List<Double> multiplication = new ArrayList<Double>();
         	for(int i = 0; i < vector1.size(); i++){
         		multiplication.add(vector1.get(i) * number);
         	}
         	$values = multiplication;
         })+)
         // Multiplicates a number and a vector. Eg: 4 * [1, 2, 3]
         | (sum5 = number (
         	MULT sum6 = vector {
         		Double number = $sum5.value;
	         	List<Double> vector1 = $sum6.values;
	         	//if(vector1.size() != vector2.size()){ throw new EmptyStackException(); }
	         	List<Double> multiplication = new ArrayList<Double>();
	         	for(int i = 0; i < vector1.size(); i++){
	         		multiplication.add(vector1.get(i) * number);
	         	}
	         	$values = multiplication;
         	} 
         )+)
    ;
   
vector returns [List<Double> values]
    /*represents vectors as a List. Eg: [4, 8, 15, 16, 23, 42]*/ 
	: input1 = VECTOR {
		String input = $input1.text;
		input = input.substring(1, input.length() - 1);
		String[] numbers = input.split(",");
		List<Double> list = new ArrayList<Double>();
		for(int i = 0; i < numbers.length; i++){
			list.add(Double.parseDouble(numbers[i]));
		}
		$values = list;
	}
	/*represents module of a vector*/
	| STICK input2 = VECTOR STICK{
		String input = $input2.text;
		input = input.substring(1, input.length() - 1);
		String[] numbers = input.split(",");
		List<Double> list = new ArrayList<Double>();
		for(int i = 0; i < numbers.length; i++){
			list.add(Math.abs(Double.parseDouble(numbers[i])));
		}
		$values = list;
	}
	/*represents some solved expression as a vector*/
	| L_C_BR exp1=arythmVectors R_C_BR {$values = $exp1.values;}
	/*represents a module of some solved expression as a vector*/
	| STICK L_C_BR exp2=arythmVectors R_C_BR STICK {
		List<Double> vector = $exp2.values;
		List<Double> moduledValues = new ArrayList<Double>();
		for(int i = 0; i < vector.size(); i++){
			moduledValues.add(Math.abs(vector.get(i)));
		} 
		$values = moduledValues;
	}
	/*<Vector vector_var>*/
	| exp3=VAR_VECTOR {
		String varName = $exp3.text.split("<Vector")[1].trim();
		varName = varName.split(">")[0];
		$values = (ArrayList)varMap.get(varName);
	};
	
number returns  [Double value]
	: input1 = NUMBER {
		$value = Double.parseDouble($input1.text);
	}
	| input2 = VAR_NUMBER{
		String varName = $input2.text.split("<Number")[1].trim();
		varName = varName.split(">")[0];
		$value = (Double)varMap.get(varName);
	};

VAR_NUMBER: L_T_BR NUMBER_TYPE WS ID R_T_BR;
VAR_VECTOR: L_T_BR VECTOR_TYPE WS ID R_T_BR;


VECTOR: L_BR (NUMBER COMMA)+ NUMBER R_BR; 

//Types
NUMBER_TYPE: 'Number';
VECTOR_TYPE: 'Vector';
PRINT: 'print';

STICK: '|';
L_BR: '[';
R_BR: ']';
L_C_BR: '(';
R_C_BR: ')';
L_T_BR: '<';
R_T_BR: '>';
NUMBER : ('-')?('0'..'9')+ ('.' ('0'..'9')+)?; // float number
WS  :   (' ' | '\t' | '\r'| '\n') -> channel(HIDDEN); // Ignore WhiteSpace characters
ID:  ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*; // match lower-case identifiers

//Dividers:
COMMA: ',';
SEMICOLON: ';';



//Operations:
PLUS: '+';
EQUALS: '=';
MINUS: '-';
MULT: '*';
