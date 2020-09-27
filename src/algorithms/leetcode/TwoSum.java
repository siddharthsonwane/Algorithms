package algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");

        int arraySize = in.nextInt();



        System.out.println("Enter the array elemet :");

        int arr[] = new int[arraySize];

        for (int i = 0; i< arraySize; i ++){

            arr[i]  = in.nextInt();

        }


        System.out.println("Enter the target element :");

        int target  = in.nextInt();
        int sum [] = printTwoAddition(arr,target);




        System.out.println(""+sum[0]+""+sum[1]);


    }

    private static int[] printTwoAddition(int[] arr, int target) {

        int sum[] = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);

            sum[0] = arr[i];
            sum[1] = i;
        }

        return sum;

      }

    }







