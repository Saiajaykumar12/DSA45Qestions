// 8. Write a program that finds the length of a string without using the len() function.
// Example1:
// Input: “Program”
// Output: 7
// Example2:
// Input: “Number”
// Output: 6

import java.util.Scanner;
public class Problem8 {
    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();

        int count = 0;
        for(char c : str.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
