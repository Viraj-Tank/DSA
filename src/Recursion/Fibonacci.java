package Recursion;

// 1. Recursive case - the flow
// 2. Base case - the stopping condition (below example)
// 3. Unintentional case - the constraint (minus value or something else)

public class Fibonacci {
    public static void main(String[] args) {
        int fibonacciAnswer = Fibonacci.fibo(4);
        System.out.println(fibonacciAnswer);
    }

    public static int fibo(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
