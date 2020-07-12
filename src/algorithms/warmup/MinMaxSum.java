package algorithms.warmup;

import java.util.Scanner;

public class MinMaxSum {


    public static void main(String[] args) {



        System.out.println("Enter the number of element to sum:");

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        long sum = 0;
        long max = 0;
        long min = Long.MAX_VALUE;

        for(int i = 0; i < num ; i ++){
         System.out.println("Enter :"+i);

         long input = number.nextInt();

         if(max < input){

             max = input;

         }if(min > input){

             min = input;

            }
         sum += input;
      }

     long minSum = sum - max;
     long maxSum = sum - min;
    System.out.println(minSum+" "+maxSum);
  }
}
