package org.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 5);
        assertTrue("A soma de 10 + 5 deveria ser 15", result == 15);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 5);
        assertFalse("A subtração de 10 - 5 não deveria ser negativa", result < 0);
    }
}
