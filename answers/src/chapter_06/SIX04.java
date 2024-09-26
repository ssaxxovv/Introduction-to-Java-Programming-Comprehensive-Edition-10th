package chapter_06;

import java.util.Scanner;

/* @ssaxxovv - 2ND YEAR

6.4 - (Display an integer reversed) Write a method with the following header to display
      an integer in reverse order:

      public static void reverse(int number)

      For example, reverse(3456) displays 6543. Write a test program that prompts
      the user to enter an integer and displays its reversal.

 */
public class SIX04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        reverse(3456);
    }
    public static void reverse(int number) {
        String numberString = Integer.toString(number);
        String reversed = "";
        for (int i = numberString.length()-1; i >= 0; i--) {
            reversed += numberString.charAt(i);
        }
        System.out.println("Reversed version of integer " + number + " is " + reversed);
    }
}