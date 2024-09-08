package org.example;

public class Main {
    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        System.out.println(fibonacciNumbers.integrationMethod(8));
        System.out.println(fibonacciNumbers.recursionMethod(8));
        System.out.println(fibonacciNumbers.dynamicProgrammingMethod(8));
    }
}