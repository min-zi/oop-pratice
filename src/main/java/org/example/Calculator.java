package org.example;

public class Calculator {
    public static int calculator(int operand1, String operator, int operand2) {
//        if ("+".equals(operator)) {
//            return operand1 + operand2;
//        } else if ("-".equals(operator)) {
//            return operand1 - operand2;
//        } else if ("*".equals(operator)) {
//            return operand1 * operand2;
//        } else if ("/".equals(operator)) {
//            return operand1 / operand2;
//        }
//        return 0;
        return ArithmeticOperator.calculate(operand1, operator, operand2);
    }
}
