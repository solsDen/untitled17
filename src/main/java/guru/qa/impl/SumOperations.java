package guru.qa.impl;

import guru.qa.Operations;

public class SumOperations extends Operations {
    public SumOperations() {
        super("сложение", '+');
    }

    @Override
    public int doOperations(int first, int second) {
        return first + second;
    }
}
