package org.example.intermediate._1_problem_solving;

public class SquareRootOfPerfectSquareNo {

    public static void main(String[] args) {
        /*
         *   Prefect square no are those the square of an integer
         *
         *   9 is perfect square as its square of 3
         * */

        int perfectSquare = 64;
        int ans = findTheSquareRoot(perfectSquare);
    }

    private static int findTheSquareRoot(int perfectSquare) {
        /*
         *   Brute force approach is traverse from 1 to perfectSquare.
         *   square each no and check if its equal to perfectSquare
         *
         *      TC = O(n)
         *      SC = O(1)
         *  */


        for (int i = 2; i <= perfectSquare; i++) {
            if (i * i == perfectSquare) {
                return i;
            }
        }
        return -1; // if given value is not a perfectSquare
    }

    private static int squareRootOfPerfectSquareUsingBinarySearch(int perfectSquare) {
        /*
         *  finding square root of perfect square using Binary Search
         *
         *  TC = O(logN)
         *  SC = O(1)
         *
         *   */
        int low = 1;
        int high = perfectSquare;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == perfectSquare) {
                return mid;
            } else if (mid * mid > perfectSquare) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // if given value is not a perfectSquare
    }
}
