package org.example;

public class Main {
    public static void main(String[] args) {
    }

    public static int fibonacci(int n) {

        if (n <= 2) {
            return n-1;
        }

        int num1 = 0;
        int num2 = 1;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }

        return result;
    }

}