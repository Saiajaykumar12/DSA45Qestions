
import java.util.Scanner;

// 24. Write a program to check if a string has a number or not without using Built-in string
// methods.
// Example1:
// Input: “num2er”
// Output: “The given string contain a number.”
// Example2:
// Input: “string”
// Output: “the given string does not contain a number”

public class Problem24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        char[] chars = new char[n];

        for(int i=0;i<n;i++){
            chars[i] = str.toCharArray()[i];
        }
        boolean hasNumber = false;

        for(int i=0;i<chars.length;i++){
            if(chars[i]>'0' && chars[i]<='9'){
                hasNumber = true;
                break;
            }
        }
        if(hasNumber){
            System.out.println("It has number");
        }
        else{
            System.out.println("It doesn;t have a number");
        }
    }
}