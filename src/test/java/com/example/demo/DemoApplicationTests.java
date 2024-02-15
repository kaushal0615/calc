package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {


    @Test
    public void testAddition() {
        assertEquals(10.0, DemoApplication.add(5.0, 5.0));
    }

    @Test
    public void testSubtraction() {
            assertEquals(5.0, DemoApplication.subtract(10.0, 5.0));
    }

    @Test
    public void testMultiplication() {
        assertEquals(25.0, DemoApplication.multiply(5.0, 5.0));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, DemoApplication.divide(10.0, 5.0));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, DemoApplication.squareRoot(4.0));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, DemoApplication.factorial(5));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(1.0, DemoApplication.naturalLog(Math.E));
    }

    @Test
    public void testPower() {
        assertEquals(32.0, DemoApplication.power(2.0, 5.0));
    }

}
