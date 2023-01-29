package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;

public class AppTest extends TestCase {
    private final App app = new App();

    @Test
    public void averageValue() {
        int[] array = {1, 5, 8, 2, 4};

        int expected = 4;
        int actual = app.averageMatrix(array);
        assertEquals(expected, actual);

    }
    @Test
    public void testIsSquare() {
        int [][] array = {{3,3},{3,3}};
        boolean expected = true;
        boolean actual = app.isSquare(array);
        assertEquals(expected, actual);
    }






}


