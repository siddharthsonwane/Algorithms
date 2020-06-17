package algorithms;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        System.out.println("Enter size of diagonal");
        int size = in.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter diagonal element:");
        for (int i = 0; i < size; i ++){
          arr[i] = in.nextInt();
         }
        plusMinus(arr);
    }

    private static void plusMinus(int[] arr) {
        double positive = 0;
        double negative = 0;
        double zero =0;

        double positiveSum = 0;
        double negativeSum = 0;
        double zeroSum = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > 0 ){

                positive++;

            }else if(arr[i] < 0){

                negative ++;

            }else if (arr[i]  == 0){

                zero ++;
            }
        }

        positiveSum = (positive/arr.length);
        negativeSum = (negative/arr.length);
        zeroSum =  (zero/arr.length);

        System.out.println(positiveSum+"\n"+negativeSum +"\n"+zeroSum);
    }
}
