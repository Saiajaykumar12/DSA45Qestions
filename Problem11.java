// 11.Determine if a string is palindrome without using built-in methods or slicing.
// Example1:
// Input: “madam”
// Output: the given string is palindrome
// Example2:
// Input: “number”
// Output: the given string is not a palindrome
public class Problem11{
    public static void main(String[] args) {
        String str = "MADAM";
        boolean isPalindrome = true;
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }
}