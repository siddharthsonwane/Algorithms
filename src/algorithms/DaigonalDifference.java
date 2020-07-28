package algorithms;

import java.util.Scanner;

public class DaigonalDifference {

    public static void main(String[] args) {

       Scanner in =  new Scanner(System.in);

        System.out.println("Enter size of diagonal");
        int size = in.nextInt();
          //
         int arr[][] = new int[size][size];

        System.out.println("Enter diagonal element:");
        for (int i = 0; i < size; i ++){

            for(int j = 0; j < size; j++){

                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("abs  diff : "+ diagonalDiff(arr,size));




    }

    private static int diagonalDiff(int[][] arr, int n) {

        // Initialize sums of diagonals
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                // finding sum of primary diagonal
                if (i == j)
                    d1 += arr[i][j];

                // finding sum of secondary diagonal
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);



    }


}
