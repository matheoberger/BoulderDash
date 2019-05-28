package model.element;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.Permeability;
import model.element.mobile.Rock;

public class ElementTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    public Rock rock;

    @Test
    public void getPermeabilitytest() {
        final Permeability expected = Permeability.BLOCKING;
        assertEquals(expected, this.rock.getPermeability());

    }

    @Test
    public void getSpritetest() {
        final Sprite expected = new Sprite('R', "Rock.jpg");
        assertEquals(expected, this.rock.getSprite());

    }

    @Test
    public void isExplosableTest() {
        final Boolean expected = false;
        assertEquals(expected, this.rock.isExplosable());

    }

    @Before
    public void setUp() throws Exception {
        this.rock = new Rock();
    }

    @After
    public void tearDown() throws Exception {
    }

}
