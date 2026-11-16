package com.exam;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testGetStatus() {
        App app = new App();
        assertEquals("Java Maven Build Successful!", app.getStatus());
    }

    @Test
    public void testMain() {
        App.main(new String[]{});
    }
}

