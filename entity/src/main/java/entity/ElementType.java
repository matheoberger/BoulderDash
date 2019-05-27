package entity;

public class ElementType {

    private int id;
    private char label;
    private char elementChar;

    public char getElementChar() {
        return this.elementChar;
    }

    public int getId() {
        return this.id;
    }

    public char getLabel() {
        return this.label;
    }

    public void setElementChar(final char elementChar) {
        this.elementChar = elementChar;
    }

    public void setLabel(final char label) {
        this.label = label;
    }

}
