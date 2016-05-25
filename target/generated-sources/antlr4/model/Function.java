package model;

import java.util.List;

public class Function {
    private String id;
    private List<String> args;
    public VariableMemory variables;

    public Function(String id, List<String> args) {
        this.id = id;
        this.args = args;
        variables = new VariableMemory();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }


    public String getId() {
        return id;
    }

    public List<String> getArgs() {
        return args;
    }
    
}
