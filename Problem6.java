// 6. Factorial number Program.
// Example: Input:5
// Output: 120
// Example2: Input:4
// Output:24

import java.util.Scanner;

public class Problem6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    static long factorial(int n){
        if(n==0 || n==1) return 1;
        return n*factorial(n-1);
    }
}
