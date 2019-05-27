package entity;

public class Map {

    private int id;
    private String label;
    private int width;
    private int height;

    Map() {

    }

    public int getHeight() {
        return this.height;
    }

    public int getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }

    public int getWidth() {
        return this.width;
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
