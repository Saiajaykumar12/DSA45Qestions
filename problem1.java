// 1. Write a Program to check given year is Leap Year or not without using modulus (%)
// operator.
// Example1:
// Input: 2024
// Output: It is a Leap Year
// Example2:
// Input: 2023
// Output: It is not a Leap Year


import java.util.Scanner;

class CheckLeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year: ");

        int year = sc.nextInt();



        // check divisibility

        boolean divisibleby400 = (year-(year/400)*400==0);

        boolean divisibleby4 = (year-(year/4)*4==0);

        boolean divisibleby100 = (year-(year/100)*100==0);

        if(divisibleby400 && divisibleby4 || divisibleby100){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
        sc.close();
    }
}