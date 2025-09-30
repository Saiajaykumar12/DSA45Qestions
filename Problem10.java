// 10. How to reverse a string without using built-in string reversal functions.
// Example1:
// Input: “string”
// Output: “gnirts
// Example2:
// Input: “name”
// Output: “eman”

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args){
        System.out.println("Enter your string: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String revstr = "";

        for(int i=str.length()-1;i>=0;i--){
            revstr += str.charAt(i);
        }
        System.out.println(revstr);
    }
}
