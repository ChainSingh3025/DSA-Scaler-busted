package org.example.intermediate._1_problem_solving;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean status = checkPrimeOrNot(value);
        System.out.println(value + " is prime or not : " + status);
        int value2 = scanner.nextInt();
        boolean answer = checkPrimeOrNotApproach2(value2);
        System.out.println(value2 + " is prime or not : " + answer);
    }

    private static boolean checkPrimeOrNotApproach2(int value) {
        if (value <= 1) {
            return false;
        }
        int no_of_factors = 0;
        double sqrt = Math.sqrt(value);
        for (int i = 1; i <= (value/i); i++) {
            if (value % i == 0) {
                no_of_factors+=2;
            }
        }
        if (no_of_factors == 2) {
            return true;
        } else {
            return false;
        }
    }

    /*
     *   A no is prime if it has no of factor = 2
     * */

    // approach 1
    private static boolean checkPrimeOrNot(int value) {
        if (value <= 1) {
            return false;
        }
        int no_of_factors = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                no_of_factors++;
            }
        }
        if (no_of_factors == 2) {
            return true;
        } else {
            return false;
        }

        /*
         *   TC is O(N)
         *   SC is O(1)
         * */

    }
}
