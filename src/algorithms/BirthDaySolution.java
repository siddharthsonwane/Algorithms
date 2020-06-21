package algorithms;

import java.util.Scanner;

public class BirthDaySolution {

    static int birthdaySolu(int[] ar) {
        int tallest = 0;
        int frequency = 0;
        for(int height=0; height < ar.length; height++){
            if(ar[height] > tallest){
                tallest = ar[height];
                frequency = 1;
            }
            else if(ar[height] == tallest) {
                frequency++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = in.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array element:");
        for (int i = 0; i < size; i ++){
            arr[i] = in.nextInt();
        }

        System.out.println(birthdaySolu(arr));
    }


}
