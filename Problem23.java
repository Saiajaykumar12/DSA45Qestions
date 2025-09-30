// 23. Write a program that takes a string as input and returns its middle term(s).
// Example:
// Input: Python
// Output: th
// Example2:
// Input: Giridhara
// Output: d

import java.util.Scanner;

public class Problem23{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        int mid = str.length()/2;
        if(str.length() % 2 == 0){
            System.out.println(str.substring(mid-1,mid+1));
        }
        else{
            System.out.println(str.charAt(mid));
        }
    }
}