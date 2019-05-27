package entity;

public class FillingMap {

    private int id;
    private int idElementstypes;
    private int x;
    private int y;

    private Map map;
    private ElementType elementType;

    public ElementType getElementType() {
        return this.elementType;
    }

    public int getId() {
        return this.id;
    }

    public int getIdElementstypes() {
        return this.idElementstypes;
    }

    public Map getMap() {
        return this.map;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setElementType(final ElementType elementType) {
        this.elementType = elementType;
    }

    public void setIdElementstypes(final int idElementstypes) {
        this.idElementstypes = idElementstypes;
    }

    public void setMap(final Map map) {
        this.map = map;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public void setY(final int y) {
        this.y = y;
    }

}
