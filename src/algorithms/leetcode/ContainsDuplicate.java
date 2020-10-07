package algorithms.leetcode;

import java.util.HashSet;

public class ContainsDuplicate {


    public static void main(String[] args) {

        int nums[] = {1,2,1,2,2};

        boolean result = containsDuplicate(nums);
        System.out.println("result contains duplicate:" +result);


    }

    private static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();

        for (int i= 0; i<nums.length;  i++){

            if (numbers.contains(nums[i])) return  true;
            numbers.add(nums[i]);

        }


        return false;
    }

}
