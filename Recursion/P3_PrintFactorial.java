package Recursion;

public class P3_PrintFactorial {
    public static int printFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * printFactorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n));

    }
}
