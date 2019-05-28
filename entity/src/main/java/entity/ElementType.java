package entity;

public class ElementType {

    private final int id;
    private final String label;
    private final char elementChar;

    public ElementType(final int id, final String label, final char elementChar) {
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

    public String getLabel() {
        return this.label;
    }

}
