package guru.qa;

public abstract class Operations {

    private final String name;
    private final char symbol;

    public Operations(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract int doOperations(int first, int second);
}
