import java.util.Scanner;

// 28. A run is a bus conductor. His ticket machine is printing numbers in reverse order
// due to a technical glitch. As a Programmer on the bus, you are asked to help him by
// creating a program to display the numbers correctly.
// Example:
// Input :320
// Output: Number in reverse order: 23
// Example:
// Input :123
// Output: Number in reverse order: 321

public class Problem28{
    public static void main(String[] args){
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversed = 0;
        while(num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }
        System.out.println(reversedP);
    }
}