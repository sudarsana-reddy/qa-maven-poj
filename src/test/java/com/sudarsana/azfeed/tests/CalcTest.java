package com.sudarsana.azfeed.tests;

import com.sudarsana.azfeed.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    @Test
    public void testAdd(){
        int result = new Calculator().add(2,3);
        Assert.assertEquals(result, 5, "Expected sum of 2 and 3 as 5");
    }

    @Test
    public void testMultifly(){
        int result = new Calculator().multiply(2,3);
        Assert.assertEquals(result, 6, "Expected 2 * 3 as 6");
    }

}
