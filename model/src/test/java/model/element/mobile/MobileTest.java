package model.element.mobile;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobileTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    public Rock rock;

    @Test
    public void getStrategytest() {
        final StrategyMove expected = new MoveGravity();
        assertEquals(expected.getClass(), this.rock.getStrategyMove().getClass());
    }

    @Test
    public void getXtest() {
        final int expected = 1;
        assertEquals(expected, this.rock.getX());
    }

    @Test
    public void getYtest() {
        final int expected = 1;
        assertEquals(expected, this.rock.getY());
    }

    @Test
    public void isLocationUsedtest() {
        final Boolean expected = false;
        assertEquals(expected, this.rock.isLocationUsed(1, 1));
    }

    @Before
    public void setUp() throws Exception {
        this.rock = new Rock();

    }

    @Test
    public void setXtest() {
        final int expected = 0;
        this.rock.setX(0);
        assertEquals(expected, this.rock.getX());
    }

    @Test
    public void setYtest() {
        final int expected = 0;
        this.rock.setY(0);
        assertEquals(expected, this.rock.getY());
    }

    @After
    public void tearDown() throws Exception {
    }

}
