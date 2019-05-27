package contract;

import java.awt.Image;
import java.io.IOException;

public interface iSprite {

    char getConsoleImage();

    Image getImage();

    String getImageName();

    boolean isImageLoaded();

    void loadImage() throws IOException;

}