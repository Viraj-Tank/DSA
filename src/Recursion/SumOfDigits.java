package Recursion;

// 1. Recursive case - the flow
// 2. Base case - the stopping condition --> if(n==0)
// 3. Unintentional case - the constraint (minus value or something else) --> floating numbers or negative numbers

// f(n) = n % 10 + f(n / 10)

public class SumOfDigits {
    public static void main(String[] args) {
        var answer = SumOfDigits.sumOfDigits(111);
        System.out.println(answer);
    }

    static int sumOfDigits(int n) {
        if (n == 0 || n < 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }
}
