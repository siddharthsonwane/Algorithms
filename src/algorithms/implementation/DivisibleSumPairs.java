package algorithms.implementation;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {

    public static void main(String[] args) {


        List<Integer> l =  Arrays.asList(1,3 ,2 ,6 ,1 ,2);
        int  k = 3;
        int validPairs = findValidPairs(l,k);
        System.out.println("validPairs"+validPairs);


    }

    private static int findValidPairs(List<Integer> l, int k) {

        int validPairs = 0;

        for(int i = 0; i < l.size(); i ++){

            for(int j = i +1; j < l.size(); j ++){

                if( (l.get(i) + l.get(j)) % k == 0){

                    validPairs ++;

                }

            }
        }

        return validPairs;

    }


}
