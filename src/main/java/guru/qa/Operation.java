package guru.qa;

import guru.qa.impl.DivOperations;
import guru.qa.impl.MultOperations;
import guru.qa.impl.SubOperatons;
import guru.qa.impl.SumOperations;

public enum Operation {
    SUM(new SumOperations()),
    MULT(new MultOperations()),
    DIV(new DivOperations()),
    SUB(new SubOperatons());

    private final Operations operations;

    Operation(Operations operations) {
        this.operations = operations;
    }

    public Operations getImplementation() {
        return operations;
    }

    public static Operation lookup(char symbol) {

        for (Operation value : values()) {
            if (value.getImplementation().getSymbol() == symbol)
                return value;
        }
        throw new IllegalArgumentException("Incorrect symbol: " + symbol);
    }
}
