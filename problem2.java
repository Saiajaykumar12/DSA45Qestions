// 2. How can you determine whether a number is even or odd without using the
// modulus operator (%).
// Example1:
// Input: 3
// Output: This is Odd Number
// Example2:
// Input: 10
// Output: This is Even Number

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        
        int num = sc.nextInt();

        if(num-(num/2)*2 == 0){
            System.out.println(num+" is an even number");
      }
      else{
        System.out.println(num+" is an odd number");
      }
      sc.close();
        
    }
}
