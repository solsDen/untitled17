package guru.qa.impl;

import guru.qa.Operations;

public class MultOperations extends Operations {

    public MultOperations() {
        super("умножение", '*');
    }

    @Override
    public int doOperations(int first, int second) {
        return Math.multiplyExact(first, second);
    }
}
