// 29. Implement the ternary operator without using conditional statements.
// Example1:
// Input: a=5, b=15
// Output: 15 is greater
// Example2:
// Input: a=20, b=10
// Output: 20 is greater

import java.util.Scanner;

public class Problem29{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(greater(a,b));

    }
    public static String greater(int a,int b){
        return (a>b)? a + " is greater" : b + " is greater";
    }
}