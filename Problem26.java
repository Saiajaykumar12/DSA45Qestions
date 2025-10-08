
import java.util.Scanner;

// 26. Convert the string into integer, without using the built-in int() function.
// Example1:
// Input: “123”
// Output:123
// Example2:
// Input: “456”
// Output:456

public class Problem26{
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = new char[str.length()-1];
        for(int i : chars){
            chars[i] = str.toCharArray()[i];
        }
        for(int i : chars){
            System.out.print(chars[i]);
        }
    }
}