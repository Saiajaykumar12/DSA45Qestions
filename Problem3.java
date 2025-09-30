// 3. Write a program to print numbers from 1 to 100 without using loops.
// Example1:
// Input: NA
// Output: 1,2,3,4,5,6, ....,100

public class Problem3 {
    
    static void printnum(int n){
        if(n<=100){
            System.out.print(n);
            if(n<100){
                System.out.print(",");
            }
            printnum(n+1);
        }
        
    }

    public static void main(String[] args) {
        printnum(1);
    }
}
