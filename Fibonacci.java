package org.fibonacci.num;

public class Fibonacci {

    public static void main(String[] args) {
        FibonacciNumbers(/*number*/);
        FibonacciNumbersEffectiveMethod(/*number*/);
    }

    public static long FibonacciNumbers(int n) {
        if (n <= 1)
            return n;
        return FibonacciNumbers(n - 1) + FibonacciNumbers(n - 2);
    }

    public static long FibonacciNumbersEffectiveMethod(int n) {
        long[] Array = new long[n + 1];

        Array[0] = 0;
        Array[1] = 1;

        for (int i = 2; i <= n; i++)
            Array[i] = Array[i - 1] + Array[i - 2];

        return Array[n];
    }
}
