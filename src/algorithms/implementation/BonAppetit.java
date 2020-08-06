package algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        int ar[] = new int[n];

        for(int i = 0; i < n; i ++){

            System.out.println("Enter arr element at position:"+i);

            ar[i] = in.nextInt();
        }

        System.out.println("enter  k value for not eaten");
        int k = in.nextInt();

        System.out.println("enter  b value for total bill by Bon");
        int b = in.nextInt();

        spiltBill(ar,k,b);


    }

    private static void spiltBill(int[] ar, int k, int b) {

     int totalCost = 0;
     int notEaten = 0;

    for(int  i = 0; i < ar.length; i ++){

        if(i == k)notEaten = ar[i];
        totalCost  += ar[i];
     }

    if(b == totalCost/2){
        System.out.println(notEaten/2);

    }

        System.out.println("Bon Appetit");

    }

}
