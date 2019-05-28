package model.element.mobile;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FallingMobileTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    public Rock rock;

    @Test
    public void getVisibletest() {
        final Boolean expected = true;
        assertEquals(expected, this.rock.getVisible());
    }

    @Test
    public void isFallingtest() {
        final Boolean expected = false;
        assertEquals(expected, this.rock.isFalling());
    }

    @Test
    public void killtest() {
        final Monster monster = new Monster();
        final Boolean expected = false;
        this.rock.kill(monster);
        assertEquals(expected, monster.getAlive());
    }

    @Test
    public void setFallingtest() {
        final Boolean expected = false;
        this.rock.setFalling(false);
        assertEquals(expected, this.rock.isFalling());
    }

    @Before
    public void setUp() throws Exception {
        this.rock = new Rock();
    }

    @Test
    public void setVisibletest() {
        final Boolean expected = false;
        this.rock.setVisible(false);
        assertEquals(expected, this.rock.getVisible());
    }

    @After
    public void tearDown() throws Exception {
    }

}
