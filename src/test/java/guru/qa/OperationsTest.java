package guru.qa;

import guru.qa.impl.DivOperations;
import guru.qa.impl.MultOperations;
import guru.qa.impl.SubOperatons;
import guru.qa.impl.SumOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationsTest {

    private Operations operations;

    @Test
    void multTest() {
        operations = new MultOperations();
        Assertions.assertEquals(6, operations.doOperations(3, 2));
    }

    @Test
    void subTest() {
        operations = new SubOperatons();
        Assertions.assertEquals(1, operations.doOperations(3, 2));
    }

    @Test
    void sumTest() {
        operations = new SumOperations();
        Assertions.assertEquals(5, operations.doOperations(3, 2));
    }

    @Test
    void divTest() {
        operations = new DivOperations();
        Assertions.assertEquals(2, operations.doOperations(10, 5));
    }
}
