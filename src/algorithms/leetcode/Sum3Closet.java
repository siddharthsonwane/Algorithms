package algorithms.leetcode;

import java.util.Arrays;

public class Sum3Closet {


    public static void main(String[] args) {

        int array[] = {-1,2,1,4};
        int target = 1;

        int result = find(array, target);
        System.out.println(""+result);


    }

    private static int find(int[] array, int target) {

      int result =  array[0] + array[1] + array[array.length -1];

      Arrays.sort(array);

      for(int i = 0; i < array.length -2; i ++){

          int a_pointer = i + 1;
          int b_pointer = array.length -1;

          while(a_pointer < b_pointer ){

              int current_sum  = array[i] + array[a_pointer] + array[b_pointer];
              if(current_sum > target){

                  b_pointer -= 1;

              }else{

                  a_pointer +=1;

              }

              if (Math.abs(current_sum - target) < Math.abs(result - target)){

                  result = current_sum;
              }

          }

      }
       return result;

    }


}
