package algorithms.implementation;


import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1 ,1 ,1 ,1 ,1 ,1);

        int m = 3;
        int d = 2;

        int result = waysToFind(list,m,d);
        System.out.println("result:"+result);


    }

    private static int waysToFind(List<Integer> list, int m, int d) {



        int ways = 0;
        int sum = 0;


        if(m <= list.size()){

            for(int j = 0; j < m ; j ++){

                sum += list.get(j);
            }

            if(sum == d){
                ways ++;
            }

        }


        for(int i = 0; i <list.size() - m; i ++){

            sum =  sum - list.get(i) + list.get(i + m);
            if(sum == d){
                ways ++;

            }



        }

        return  ways;

  }


}
