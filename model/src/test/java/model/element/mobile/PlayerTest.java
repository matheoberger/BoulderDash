package model.element.mobile;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.element.Element;
import model.element.motionless.Dirt;
import model.element.motionless.Tunnel;

public class PlayerTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    public Player player;

    @Test
    public void digTunneltest() {
        final Element expected = new Tunnel();
        this.player.getMap().setXYElement(5, 6, new Dirt());
        this.player.digTunnel(5, 6);
        assertEquals(expected.getClass(), this.player.getMap().getXYElement(5, 6).getClass());
    }

    @Test
    public void pickupDiamondtest() {
        final Diamond diamond = new Diamond();
        final Boolean expected = false;
        diamond.setX(5);
        diamond.setY(6);
        this.player.pickupDiamond(diamond);
        assertEquals(expected, diamond.getVisible());
    }

    @Test
    public void pushRocktest() {
        final Rock rock = new Rock();
        rock.setX(5);
        rock.setY(6);
        this.player.pushRock(rock);
        assertEquals(5, rock.getX());
        assertEquals(7, rock.getY());
    }

    @Before
    public void setUp() throws Exception {
        this.player = new Player();
        this.player.setX(5);
        this.player.setY(5);
    }

    @After
    public void tearDown() throws Exception {
    }

}
