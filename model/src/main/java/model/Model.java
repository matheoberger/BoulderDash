package model;

import java.util.Observable;

import model.element.Element;

public final class Model extends Observable {

    private String label;
    private Element[][] elements;

    public Element[][] getElements() {
        return this.elements;

    }

    public Observable getObservable() {
        return this;
    }

    public Element getXYElement(final int x, final int y) {
        return this.elements[x][y];
    }

    public void loadMap(final int id) {

    }

    public void setElements(final Element[][] elements) {
        this.elements = elements;
    }

    public void setXYElement(final int x, final int y, final Element element) {
        this.elements[x][y] = element;
    }
}
