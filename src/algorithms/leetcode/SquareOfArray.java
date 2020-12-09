package algorithms.leetcode;

public class SquareOfArray {
    public static void main(String[] args) {

        int nums[] = {-4,-1,0,3,10};
        int result[] = sortArray(nums);

        for (int i = 0; i < result.length; i++) {

            for (int j = i +1; j < result.length; j++) {

                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }



            }

            System.out.println("++++++++++" + result[i]);
        }





    }

    private static int[] sortArray(int[] nums) {

        int result[] = new int[nums.length];

        for(int i = 0; i < nums.length; i ++){

            result[i] = nums[i] * nums[i];



        }

        return result;


    }

}
