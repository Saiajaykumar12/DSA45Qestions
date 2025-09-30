// 12. How would you generate random numbers in a program without utilizing the
// random module?
// Example1:
// Input: NA
// Output:10
// Example2:
// Input: NA
// Output:60


public class Problem12{
    public static void main(String[] args) {
        int n = (int)(Math.random()*100);
        System.out.println(n);
    }
}

