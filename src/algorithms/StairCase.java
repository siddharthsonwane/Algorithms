package algorithms;

import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of stair case");

        int n = in.nextInt();

        StringBuffer stair = new StringBuffer("");

        for(int i = 0;i<n;i++){

           stair.append(" ");

        }
        for(int i =1; i < n+ 1; i++){

            stair.setCharAt(n-i,'#');
            System.out.println(stair);

        }



    }

}
