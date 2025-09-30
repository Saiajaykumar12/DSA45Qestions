// 7. Add two numbers without using ‘+’ operator.
// Example1:
// Input: 2, 5
// Output: 7
// Example2:
// Input: 10, 15
// Output: 25

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        System.out.println(merged.length);

    }
}