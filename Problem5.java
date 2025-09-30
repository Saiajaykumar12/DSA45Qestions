// 5. Prime Number Program.
// Example: Input:5
// Output: It is prime Number
// Example2: Input:4
// Output: It Not a prime Number

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;

        for(int i=3;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
