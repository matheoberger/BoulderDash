package contract;

public interface iMap {

    iElement[][] getElements();

    int getHeight();

    String getLabel();

    int getWidth();

    void setElements(iElement[][] elements);

}