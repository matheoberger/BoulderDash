package model.element.mobile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MonsterTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    public Monster monster;

    @Test
    public void createDiamondstest() {
        final Diamond diamond = new Diamond();
        this.monster.setX(5);
        this.monster.setY(5);
        this.monster.createDiamonds();
        final int x = this.monster.getX();
        final int y = this.monster.getY();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.monster.getMap().getXYElement((x - 1) + i, (y - 1) + j).getClass() != diamond.getClass()) {
                    fail("Error in diamonds creation");
                }

            }
        }
    }

    @Test
    public void killtest() {
        final Player player = new Player();
        final Boolean expected = false;
        this.monster.kill(player);
        assertEquals(expected, player.getAlive());
    }

    @Before
    public void setUp() throws Exception {
        this.monster = new Monster();
    }

    @After
    public void tearDown() throws Exception {
    }

}
