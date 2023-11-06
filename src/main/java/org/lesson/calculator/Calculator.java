package org.lesson.calculator;

public class Calculator {
    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public static float divide(float num1, float  num2) throws Exception {
        if(num1 == 0 || num2 == 0) {
            throw new Exception("The numbers can't be 0. ");
        }

        return num1 / num2;
    }

    public static float multiply(float num1, float  num2) {
        return num1 * num2;
    }
}