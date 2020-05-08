package algorithms.array;

import java.util.Arrays;

public class ArrayRemoveAtPosition {
	
	
	
	
	
	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("print the resultant array:"+Arrays.toString(arr));
		
		// get the specific index
		int index = 2;
		
		// remove the element
		
		arr = removeTheElemenet(arr, index);
		
		System.out.println("result array:"+Arrays.toString(arr));
		
		
	}

	private static int[] removeTheElemenet(int[] arr, int index) {

		  
		if(arr == null || index < 0 || index >= arr.length) {
			
			return arr;
		}
		
        // Create new array
		
		int[]  newArray = new int[arr.length -1];
		
		for(int i =0 , k = 0 ; i < arr.length; i++) {
			
			if(i == index)
				continue;
			
			
			newArray[k++] = arr[i];
			
			
		}
		 
		
		return newArray;
	}

}
