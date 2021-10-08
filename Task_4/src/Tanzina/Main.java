package Tanzina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();
        System.out.print("Enter any number between 1-100 to find divisor sum -> ");
        int n = in.nextInt();
        System.out.print("Enter any number between 1-50 to find Factorial -> ");
        int f = in.nextInt();
        System.out.println("\nSum of Divisor is: " + myCalculator.divisorSum(n));
        System.out.println("\nThe Factorial is: " + myCalculator.findFactorial(f));

    }
}

/*Name: Tanzina Akther
  ID: 2012020158
  Section: D
  Email: cse_2012020158@lus.ac.bd
  Date: 8th October 2021
 */
