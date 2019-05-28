package entity;

import java.util.ArrayList;

public class Map extends Entity {

    private final int id;
    private final String label;
    private final int width;
    private final int height;
    private ArrayList<FillingMap> fillingMaps;

    Map(final int id, final String label, final int width, final int height) {
        this.id = id;
        this.label = label;
        this.width = width;
        this.height = height;
    }

    public ArrayList<FillingMap> getFillingMaps() {
        return this.fillingMaps;
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

    public void setFillingMaps(final ArrayList<FillingMap> fillingMaps) {
        this.fillingMaps = fillingMaps;
    }

}
