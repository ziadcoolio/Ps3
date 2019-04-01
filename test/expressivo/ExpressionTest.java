/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for the Expression abstract data type.
 */
public class ExpressionTest {

    // Testing strategy
    //   
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    
    // TODO tests for Expression
    @Test
    public void MultiplicationTest() {
    	Expression left1 = new Value(2);
    	Expression right1 = new Value(3);
    	Expression left2 = new Value(4);
    	Expression right2 = new Variable("x");
    	
    	Expression multiplication1 = new Multiplication(left1, right1);
    	Expression multiplication2 = new Multiplication(left2, right2);
    	Expression multiplication3 = new Multiplication(left1, right1);
    	Expression addition = new Addition(left2, right1);
    	Expression tree = new Multiplication(left1, addition);
    	
    	assertEquals("2 * 3",multiplication1.toString());
    	assertEquals("2 * 3 + 4",tree.toString());
    	
    	assertTrue(multiplication1.equals(multiplication3));
    	assertTrue(!(multiplication1.equals(multiplication2)));
    	
    	assertEquals(multiplication1.hashCode(), multiplication3.hashCode());
    	Boolean x = !(multiplication1.hashCode()==(multiplication2.hashCode()));
    	assertTrue(x); 	
    	    	   	
    	    	    	
    }
    
    @Test
    public void testAdd() {
    	
    	
    	Expression left =new Value(3);
    	Expression right=new Value(4);
    	Expression left2 =new Value(5);
    	Expression right2=new Value(7);
    	Expression left3 =new Value(3);
    	Expression right3=new Value(8);
    	Expression left4 =new Value(9);
    	Expression right4=new Value(1);
    Expression addition1=new Addition(left,right);
    Expression addition2=new Addition(left,right);
    Expression addition3=new Addition(left3,right3);
    Expression addition4=new Addition(left4,right4);
    
    assertEquals("4 + 3",addition1.toString());
    
   assertTrue(addition1.equals(addition2));
   assertTrue(!(addition3.equals(addition2)));
   
   assertEquals(addition1.hashCode(),addition2.hashCode());

	Boolean x = !(addition1.hashCode()==(addition3.hashCode()));
	assertTrue(x); 	
   
    }
}
