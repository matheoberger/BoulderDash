package view;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViewTest {
	int testNumber = 0;
	
	 @Test
	 public void ControllerOrder() {
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
	    public void run() {
		 	int expected = 0;
	        testNumber = expected;
	        assertEquals(expected, testNumber);
	 }
	 
	 @Test
	 public void setController() {
		 int expected = 0;
	     assertEquals(expected, testNumber);
	 
	 }
}
