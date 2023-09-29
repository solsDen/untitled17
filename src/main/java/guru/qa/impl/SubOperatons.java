package guru.qa.impl;

import guru.qa.Operations;

public class SubOperatons extends Operations {
    public SubOperatons() {
        super("вычитание", '-');
    }

    @Override
    public int doOperations(int first, int second) {
        return first - second;
    }
}
