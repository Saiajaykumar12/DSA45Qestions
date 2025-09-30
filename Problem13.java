
import java.util.Scanner;

// 13. Write a program that prints numbers from 1 to n:
// For multiples of 3, print “Fizz” instead of the number
// For multiples of 5, print “Buzz”
// For numbers that are multiples of both 3 and 5, print “FizzBuzz”
// Don’t use Modulus operator or Conditional Statements.
// Example1:
// Input: 9
// Output: “Fizz”
// Example2:
// Input: 15
// Output: “FizzBuzz”

public class Problem13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            boolean divisibleby3 = i-(i/3)*3 == 0;
        boolean divisibleby5 = i -(i/5)*5 == 0;
            if(divisibleby3 && divisibleby5){
            System.out.println("FizzBuzz");
        }
        else if(divisibleby3){
            System.out.println("Fizz");
        }
        else if(divisibleby5){
            System.out.println("Buzz");
        }
        else{
            System.out.println(i);
        }
        }
    }
}