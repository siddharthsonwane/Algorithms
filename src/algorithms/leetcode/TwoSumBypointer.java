package algorithms.leetcode;

import java.util.Scanner;

public class TwoSumBypointer {

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


        int[] result = findTwoSum(arr,target);

        for (int i = 0 ; i < result.length; i ++)
            System.out.println(":"+result[i]);


    }

    private static int[] findTwoSum(int[] numbers, int target) {

        int a_pointer = 0;
        int b_pointer = numbers.length - 1;


        while(a_pointer <= b_pointer){

            int sum = numbers[a_pointer] + numbers[b_pointer];

            if(sum > target){

                b_pointer -= 1;

            }else if(sum < target){

                b_pointer += 1;

            }else {

                return  new int[]{a_pointer , b_pointer};

            }

        }
        return  new int[]{a_pointer, b_pointer};
    }


}
