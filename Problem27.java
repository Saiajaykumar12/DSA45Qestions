
import java.util.Scanner;

// 27. In a cricket match, the batting team is scoring runs with some run rate. The match is
// for 20 overs. Write a program to find the total runs scored by the batting.
// Example: Input :13
// Output: Total runs scored in 20 overs: 260.00
// Example: Input :15
// Output: Total runs scored in 20 overs: 300.00

public class Problem27{
    public static void main(String[] args) {
        System.out.println("Enter the runrate");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double result = num * 20;
        System.out.println(result);
    }
}