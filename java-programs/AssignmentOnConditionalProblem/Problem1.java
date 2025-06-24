import java.util.Scanner;

/*
Problem Statement
Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.
Sample Input and Output
Sample Input
6,5
5, 5
Expected Output
22
10
 */

public class Problem1 {

      // Using reusable function
      public static int calculateResult(int num1, int num2) {
            return num1 == num2 ? num1 + num2 : 2 * (num1 + num2);
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // Initialize Scanner

            System.out.print("Enter First Number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();

            // Using reusable function
            System.out.print(calculateResult(num1, num2));

            // using ternary operator variable = condition ? Value if_true : value if_false;
            // int result = (num1 == num2) ? num1 + num2 : 2 * (num1 + num2);
            //
            // System.out.print("result: " + result);

            // Using if and else if
            /*
             * if (num1 == num2) {
             * int result = num1 + num2;
             * System.out.print("Result: " + result);
             * } else if (num1 != num2) {
             * int result = 2 * (num1 + num2);
             * System.out.print("Result: " + result);
             * }
             */

      }
}

/*
 * we can solved this by two method
 * 1. simple if and else if condition
 * 2.ternary operator
 * 3. function to calculate
 *
 */