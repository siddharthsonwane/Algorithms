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
        for(int i = 0; i < arr.length; i++){

            positive += arr[i] >0?1:0;
            negative += arr[i] <0?1:0;
            zero += arr[i] ==0 ?1:0;

            /*if(arr[i] > 0 ){

                positive++;

            }else if(arr[i] < 0){

                negative ++;

            }else if (arr[i]  == 0){

                zero ++;
            }*/
        }

        System.out.println(positive/arr.length+"\n"+negative/arr.length+"\n"+zero/arr.length);

        /*positiveSum = (positive/arr.length);
        negativeSum = (negative/arr.length);
        zeroSum =  (zero/arr.length);

        System.out.println(positiveSum+"\n"+negativeSum +"\n"+zeroSum);*/
    }
}
