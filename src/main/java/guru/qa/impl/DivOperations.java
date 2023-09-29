package guru.qa.impl;

import guru.qa.Operations;

public class DivOperations extends Operations {

    public DivOperations() {
        super("деление", '/');
    }

    @Override
    public int doOperations(int first, int second) {
        return first / second;
    }
}
