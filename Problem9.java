// 9. Find the second largest number in a list without sorting.
// Example1:
// Input: 10, 15, 20, 5, 8
// Output: 15
// Example2:
// Input: 2, 5, 18, 6, 13
// Output: 13

public class Problem9 {

     public static int secondLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int n : arr){
            if(n>first){
                second = first;
                first = n;
            }
            else if(n>second && n!= first){
                second = n;
            }
        }

        return second;
    }
    public static void main(String[] args) {
        
        int[] arr1 = {10,14,12,15,20,13};
        System.out.println(secondLargest(arr1));
    }

}
