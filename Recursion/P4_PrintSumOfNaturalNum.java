package Recursion;

public class P4_PrintSumOfNaturalNum {
    public static int calcSumOfNum(int n){
        if(n==1){
            return 1;
        }
        calcSumOfNum(n-1);
        return n + calcSumOfNum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(calcSumOfNum(n));

    }
}
