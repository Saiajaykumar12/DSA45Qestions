// 4. How to print “Hello World!” without using the print statement.
// Example1:
// Input: “Hello World!”
// Output: Hello World!

public class Problem4 {
    
    public static void main(String[] args) {
        
        String msg = "Hello World!";

        System.out.write(msg.getBytes(),0,msg.length());
    }
}
