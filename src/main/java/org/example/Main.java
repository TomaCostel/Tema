package org.example;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.expression("10 cm + 1 m - 10 mm");
        System.out.println(calculator.getResult()+" mm");

    }
}