package chapter_06;

import java.util.Scanner;

/* @ssaxxovv - 2ND YEAR

6.3 - Write the methods with the following headers

      public static int reverse(int number)

      public static boolean isPalindrome(int number)

 */
public class SIX03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to verify if palindrome or not: ");
        int number = input.nextInt();
        System.out.println("Integer " + number + " is " + (isPalindrome(number) ? "a palindrome" : "not a " +
                "palindrome"));
    }
    public static int reverse(int number) {
        String numberString = number + "";
        String reversed = "";
        for (int i = numberString.length()-1; i >= 0; i--) {
            reversed += numberString.charAt(i);
        }
        return Integer.parseInt(reversed);
    }
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}