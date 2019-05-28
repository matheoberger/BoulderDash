package model.element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpriteTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    public Sprite sprite;

    @Test
    public void getConsoleImagetest() {
        final char expected = 'R';
        assertEquals(expected, this.sprite.getConsoleImage());
    }

    @Test
    public void getImageNametest() {
        final String expected = "Rock.png";
        assertEquals(expected, this.sprite.getImageName());
    }

    @Test
    public void isImageLoadedtest() {
        final Boolean expected = true;
        try {
            this.sprite.loadImage();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertEquals(expected, this.sprite.isImageLoaded());
    }

    @Test
    public void loadImagetest() {
        Image expected = null;
        try {
            expected = ImageIO.read(new File("images/rock.png"));
        } catch (final IOException e) {
            e.printStackTrace();
        }
        try {
            this.sprite.loadImage();
        } catch (final IOException e) {
            e.printStackTrace();
        }
        assertNotNull(this.sprite.getImage());
    }

    @Before
    public void setUp() throws Exception {
        this.sprite = new Sprite('R', "Rock.png");
    }

    @After
    public void tearDown() throws Exception {
    }

}
