package guru.qa;

import guru.qa.impl.ConsoleReader;
import guru.qa.impl.MultOperations;

public class Calculator {

    private Reader reader;

    public Calculator(Reader reader) {
        this.reader = reader;
    }

    public String run() {
        System.out.println("Первое число: ");
        int first = reader.readFirst();
        System.out.println("Второе число: ");
        int second = reader.readSecond();
        System.out.println("Операция: ");
        Operations operations = reader.readOperations();
        return "Результат: " + operations.doOperations(first, second);
    }
}
