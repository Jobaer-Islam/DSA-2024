package Recursion;

public class P9_PrintPowerofX {
    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }
        int halfpow = power(x, n / 2);
        if (n % 2 != 0) {
            //odd
            return x * halfpow * halfpow;
        }
        //even
        return halfpow * halfpow;
    }
    public static void main(String[] args) {
        System.out.println(power(5, 3));

    }
}
