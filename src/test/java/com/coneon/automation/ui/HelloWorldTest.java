package com.coneon.automation.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test
    public void testAddition() {
        int sum = 2 + 3;
        Assert.assertEquals(sum, 5, "Sum should be 5");
    }

    @Test(expectedExceptions = {UnsupportedOperationException.class})
    public void testException() {
        throw new UnsupportedOperationException("This is a test exception");
    }
}
// This is a test class for the HelloWorld class.