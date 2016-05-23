package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VariableMemory {
    private List<Variable> variableMemory;

    public VariableMemory() {
        variableMemory = new ArrayList<>();
    }

    public boolean isVariableExists(String id) {
        return (null != getVariable(id));
    }

    public String getTypeOfVariable(String id) throws Exception {
        if (isVariableExists(id)) {
            return  getVariable(id).getType();
        }
        else throw new Exception();
    }

    public Variable getVariable(String id) {
        for (Variable one : variableMemory) {
            if (one.getId().equals(id))
                return one;
        }
        return null;
    }

    public String getValueOfVariable(String id) throws Exception{
        if (isVariableExists(id)) {
            return  getVariable(id).getValue();
        }
        else throw new Exception();
    }

    public void addVariable(Variable var) throws Exception {
        if (isVariableExists(var.getId())) throw new Exception();
        variableMemory.add(var);
    }

    public  void addVariables(List <Variable> vars){
        Collections.copy(variableMemory, vars);
    }
}
