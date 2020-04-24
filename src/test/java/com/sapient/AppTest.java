package com.sapient;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    private App app;
    
    @Before
    public void setup() {
        app = new App();
    }
    
    
    @Test
    public void testOne() {
        boolean count = app.check(1);
        assertTrue(count == false);
    }

    @Test
    public void testTwenty() {
        boolean count = app.check(20);
        assertTrue(count == true);
    }

    @Test
    public void testNinteen() {
        boolean count = app.check(19);
        assertTrue(count == false);
    }

}
