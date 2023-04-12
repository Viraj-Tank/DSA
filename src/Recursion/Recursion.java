package Recursion;

class Recursion {
    public static void main(String[] args) {
        int value = 3;
        int val = Recursion.factorial(value);
        System.out.println("Factorial of " + value + " : " + val);
    }

    public static int factorial(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

///////////////////////////////////////////////////////////////////////////
//
// write any recursive method in 3 steps
//
// 1. Recursive case - the flow
// 2. Base case - the stopping condition (below example)
// 3. Unintentional case - the constraint (minus value or something else)
//
///////////////////////////////////////////////////////////////////////////


/* static string recursionmethod(String[] params) {
    if(exit from condition satisfied) {
        complete
    } else {
        recursionmethod(modified params)
    }
} */