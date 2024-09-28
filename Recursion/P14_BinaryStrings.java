package Recursion;

public class P14_BinaryStrings {
    public static void printBinaryString( int n, int lp, String str) {
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinaryString(n - 1, 0, str+"0");
        if(lp == 0){
            printBinaryString(n - 1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinaryString(3, 0, " ");
    }
}
