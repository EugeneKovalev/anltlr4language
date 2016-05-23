package model;

import java.util.ArrayList;
import java.util.List;

public class FunctionMemory {
    private List<Function> functionMemory;

    public FunctionMemory() {
        functionMemory = new ArrayList<>();
    }

    public Function getFunction(String id, int argsCount) {
        for (Function one : functionMemory) {
            if (one.getId().equals(id))
                if (one.getArgs().size() == argsCount)
                    return one;
        }
        return null;
    }

    public boolean isFunctionExists(String id, int argsCount) {
        return (null != getFunction(id, argsCount));
    }

    public void addFunction(Function foo) throws Exception {
        functionMemory.add(foo);
    }
}
