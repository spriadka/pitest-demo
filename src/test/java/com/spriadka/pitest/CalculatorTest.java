package com.spriadka.pitest;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        int result = calculator.add(1,1);
        Assert.assertTrue("Should add correctly",2 == result);
    }

    @Test
    public void testAddZero(){
        Assert.assertTrue(0 == calculator.add(0,0));
    }

    @Test
    public void testAddNegative(){
        int result = calculator.add(-2,0);
        Assert.assertTrue(-2 == result);
    }

    @Test
    public void testAddNegativeBounds(){
        int actual = calculator.add(Integer.MIN_VALUE,Integer.MIN_VALUE);
        Assert.assertTrue(0 == actual);
    }

    @Test
    public void testAddPositiveBounds(){
        int actual = calculator.add(Integer.MAX_VALUE,Integer.MAX_VALUE);
        Assert.assertTrue(0 == actual);
    }


}
