// 15. Write a program to print 1 to n number of * like below pattern
// *
//  **
//  ***
//  ****
//  *****
//  ******
//  *******

public class Problem15{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}