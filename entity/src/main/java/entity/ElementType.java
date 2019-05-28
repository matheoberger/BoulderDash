package entity;

public class ElementType {

    private final int id;
    private final char label;
    private final char elementChar;

    public ElementType(final int id, final char label, final char elementChar) {
        this.id = id;
        this.label = label;
        this.elementChar = elementChar;

    }

    public char getElementChar() {
        return this.elementChar;
    }

    public int getId() {
        return this.id;
    }

    public char getLabel() {
        return this.label;
    }

}
