package chapter_06;

import java.util.Scanner;

/* @ssaxxovv - 2ND YEAR

6.2 - Write a method that computes the sum of the digits in an integer.
      Use the following method header:

      public static int sumDigits(long n)

      For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator
      to extract digits, and the / operator to remove the extracted digit. For instance,
      to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
      (= 23). Use a loop to repeatedly extract and remove the digit until all the digits
      are extracted. Write a test program that prompts the user to enter an integer and
      displays the sum of all its digits.

 */
public class SIX02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter long integer whose digits is to be summed: ");
        long integer = input.nextLong();
        System.out.printf("Sum of digits of long integer %d is: %d", integer, sumDigits(integer));
    }
    public static int sumDigits(long n) {
        int sum = 0;
        for (long i = n; i >= 1; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }
}