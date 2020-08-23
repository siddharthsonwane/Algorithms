package algorithms.sorting;

import java.util.Scanner;

public class FactorialAlgorithms {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to find the factorial:=");

        int num = in.nextInt();

        System.out.println(iterativeFactorial(num));




    }


    public  static int iterativeFactorial(int num){
        if(num == 0) return 1;
        int factorial  = 1;
        for (int i = 1; i <= num; i ++){
            factorial *= i;

        }
        return  factorial;
    }

}
