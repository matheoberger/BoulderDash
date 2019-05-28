package model;

import model.element.Element;

public class PlayableMap {
    private Element[][] elements;
    private String label;

    public PlayableMap() {
        this.elements = new Element[10][10];
    }

    public Element[][] getElements() {
        return this.elements;

    }

    public Element getXYElement(final int x, final int y) {
        return this.elements[x][y];
    }

    public void setElements(final Element[][] elements) {
        this.elements = elements;
    }

    public void setXYElement(final int x, final int y, final Element element) {
        this.elements[x][y] = element;
    }
}
