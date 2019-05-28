package controller;

import static org.junit.Assert.*;

import org.junit.Test;

import contract.IModel;

public class ControllerTest {

    IModel model;
    int testNumber = 0;

    @Test
    public void orderPerform() {
        boolean expectedBool = false;
        switch(testNumber) {
        case 0 :
            expectedBool = true;
        default :
            break;
        }
        assertTrue(expectedBool);
    }

    @Test
    public void setModel() {
        int expected = 0;
        testNumber = expected;
        assertEquals(expected, testNumber);
    }

    @Test
    public void setView() {
        int expected = 0;
        assertEquals(expected, testNumber);
    }

}
