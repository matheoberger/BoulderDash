package entity;

public class FillingMap {

    private final int x;
    private final int y;

    private Map map;
    private ElementType elementType;

    public FillingMap(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

}
