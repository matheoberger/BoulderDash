package entity;

public class FillingMap {

    private int id;
    private int idElementstypes;
    private int x;
    private int y;

    public Map map;
    public ElementType elementType;

    public int getId() {
        return this.id;
    }

    public int getIdElementstypes() {
        return this.idElementstypes;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setIdElementstypes(final int idElementstypes) {
        this.idElementstypes = idElementstypes;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public void setY(final int y) {
        this.y = y;
    }

}
