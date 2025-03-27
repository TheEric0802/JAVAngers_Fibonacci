package org.example;

public class Main {
    public static void main(String[] args) {
    }

    public static int fibonacci(int n) {

        if (n <= 1) {
            if (n < 0) {
                throw new IllegalArgumentException("n must be positive");
            }
            return n;
        }

        int num1 = 0;
        int num2 = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }

        return result;
    }


    public static int fibonacci(double n) {
        if (n % 1 == 0) {
            return fibonacci((int) n);
        } else {
            throw new IllegalArgumentException("n must be an integer");
        }
    }

}