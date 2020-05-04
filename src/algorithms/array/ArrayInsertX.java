package algorithms.array;

import java.util.Arrays;

public class ArrayInsertX {

	public static void main(String[] args) {
		
		
		int n = 10;
		int i;
		int arr[] = {  1,2,3,4,5,6,7,8,9,10 };
		
		
		System.out.println("Initial Array:\n"+Arrays.toString(arr));
		
		int x = 50;
		
		arr = addX(n,arr,x);
		
		System.out.println("final array:\n"+Arrays.toString(arr));
	
	}

	private static int[] addX(int n, int[] arr, int x) {
          
          int newArr[] = new int[n+1];
           
          for(int i=0;i<n;i++)
        	  newArr[i] = arr[i];
          newArr[n] = x;
          
        
		return newArr;
	}
	
	
}
