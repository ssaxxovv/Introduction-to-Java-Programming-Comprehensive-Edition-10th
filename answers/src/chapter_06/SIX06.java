package chapter_06;

import java.util.Scanner;

/* @ssaxxovv - 2ND YEAR

6.6 - (Display patterns) Write a method to display a pattern as follows:

                    1
                  2 1
                3 2 1
      ...
      n n-1 ... 3 2 1

      The method header is

      public static void displayPattern(int n)

 */
public class SIX06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        displayPattern(9);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}