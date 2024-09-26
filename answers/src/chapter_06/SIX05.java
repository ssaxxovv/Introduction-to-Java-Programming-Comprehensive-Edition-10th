package chapter_06;

import java.util.Scanner;

/* @ssaxxovv - 2ND YEAR

6.5 - (Sort three numbers) Write a method with the following header to display three
      numbers in increasing order:

      public static void displaySortedNumbers(double num1, double num2, double num3)

      Write a test program that prompts the user to enter three numbers and invokes the
      method to display them in increasing order.

 */
public class SIX05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        displaySortedNumbers(3, 9, 4);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num2 < num1) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num3 < num2) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num2 < num1) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.printf("The numbers in arranged order are: %.2f, %.2f, %.2f", num1, num2, num3);
    }
}