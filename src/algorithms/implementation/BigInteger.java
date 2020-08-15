package algorithms.implementation;

import java.util.Scanner;

import java.math.BigInteger;
public class BigInteger {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to find the factorial:");

        int n = in.nextInt();

        findTheFactorial(n);


    }

    private static void findTheFactorial(int n) {


        BigInteger result = new BigInteger();
        for(int i=2; i <= n; i++){

            result = result* BigInteger.valueOf(i);


        }
        System.out.println(result);



    }

}
