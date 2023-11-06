package org.lesson.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @DisplayName("Add Test")
    public void checkAdd() {
        assertEquals(25f, Calculator.add(20f, 5f), "Expected: 25");
        assertEquals(-5f, Calculator.add(-10f, 5f), "Expected: -5");
        assertEquals(0f, Calculator.add(20f, -20f), "Expected: 0");
    }

    @Test
    @DisplayName("Subtraction Test")
    public void checkSubtraction() {
        assertEquals(15f, Calculator.subtract(20f, 5f), "Expected: 15");
        assertEquals(-15f, Calculator.subtract(-10f, 5f), "Expected: -15");
        assertEquals(40f, Calculator.subtract(20f, -20f), "Expected: 40");
    }

    @Test
    @DisplayName("Multiply Test")
    public void checkMultiply() {
        assertEquals(100f, Calculator.multiply(20f, 5f), "Expected: 100");
        assertEquals(-50f, Calculator.multiply(-10f, 5f), "Expected: -50");
        assertEquals(-400f, Calculator.multiply(20f, -20f), "Expected: -400");
    }

    @Test
    @DisplayName("Divide Test")
    public void checkDivide() {
        try {
            assertEquals(4f, Calculator.divide(20f, 5f), "Expected: 4");
            assertEquals(-2f, Calculator.divide(-10f, 5f), "Expected: -2");
            assertEquals(-1f, Calculator.divide(20f, -20f), "Expected: -1");
        }catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    @DisplayName("Divide Test with 0 as parameter")
    public void checkDivideWithZero() {
        assertThrows(Exception.class, () -> Calculator.divide(1f, 0f), "Expected: exception");
    }
}