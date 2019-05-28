package view;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViewFrameTest {
    int controller=1;
    int expected = 1;
    int testnumber=0;

    @Test
    public void getController() {
        assertEquals(expected, controller);
    }

    @Test
    public void setController() {
        testnumber=expected;
        assertEquals(expected, testnumber);
    }
}
