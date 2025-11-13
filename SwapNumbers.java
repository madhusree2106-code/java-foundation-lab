package VariablesAndBasic;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before Swapping the numbers are: a = " + a +" b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping the numbers are : a = "+a +" b =  "  + b);
    }
}
