
import java.util.Scanner;

// 18. Fibonacci series without recursion

public class Problem18{
    static int fibanocci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibanocci(n-1)+fibanocci(n-2); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Fibanocci series :");
        for(int i=0;i<num;i++){
            System.out.println(fibanocci(i)+" ");
        }
    }
}