package algorithms.leetcode;

public class ContainerWithMostOfWater {

    public static void main(String[] args) {

        int arr[]={1,8,6,2,5,4,8,3,7};

        int result = findWater(arr);
        System.out.println("#######################"+result);



    }

    private static int findWater(int[] arr) {

        int a_pointer = 0;
        int b_pointer = arr.length - 1;
        int maxArea = 0;
        while (a_pointer < b_pointer){

            if (arr[a_pointer] < arr[b_pointer]) {

                maxArea = Math.max(maxArea , arr[a_pointer] * (b_pointer - a_pointer));
                a_pointer += 1;

            }else{

                maxArea = Math.max(maxArea,  arr[b_pointer] * (b_pointer - a_pointer));
                b_pointer -= 1;
            }

        }

        return maxArea;
    }

}
