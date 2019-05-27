package entity;

public class Map extends Entity implements iMap {

    private String label;
    private String[][] elements;
    private int width;
    private int height;

    Map() {

    }

    @Override
    public String[][] getElements() {
        return this.elements;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public void setElements(final String[][] elements) {
        this.elements = elements;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public void setWidth(final int width) {
        this.width = width;
    }
}
