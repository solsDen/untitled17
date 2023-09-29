package guru.qa;

import guru.qa.impl.ConsoleReader;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String result = new Calculator(new ConsoleReader()).run();
        System.out.println(result);
    }
}
