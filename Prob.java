// 16. Perform Addition and Subtraction of two numbers without using arithmetic
// operators.
// Example1:
// Input: 12, 5
// Output: addition: 17, subtraction: 7
// Example2:
// Input: 5, 2
// Output: addition: 7, subtraction: 3

import java.util.Scanner;

public class Prob{
    public static void main(String[] args) {
        System.out.println("The addition of two number is :"+addition(10,12));
        System.out.println(subtraction(10,12));
    }
    static int addition( int a,int b){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number: ");
        // int b = sc.nextInt();
        int c;
        for(c=0;c<b;c++){
            a++;
        }
        return a;
    }
    static int subtraction(int a,int b){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number: ");
        // int b = sc.nextInt();
        int c = Math.max(a,b);
        int d =  Math.min(a,b);
        while(d>0){
            d--;
            c--;
        }
        return c;
    }
}