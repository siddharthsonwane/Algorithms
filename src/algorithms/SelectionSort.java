package algorithms;

public class SelectionSort {

	
	
	
	public static void main(String[] args) {
	
		int arr[] = {42,23,11,78,99,41,22,65};
		
		 SelectionSort selectionSort = new SelectionSort();
		 
		 selectionSort.sort(arr);
		 
		 System.out.println("Sorted array:");
		 selectionSort.printArray(arr);
		
		   
		
	}

	private void printArray(int[] arr) {
				 int n = arr.length;
				 for(int i = 0; i < n ; i++ )
					 System.out.println("array:"+arr[i]);
		
		
		
	}

	private void sort(int[] arr) {
         
		int n =arr.length;
		
		for(int i = 0; i < n-1; i++) {
			
			int min = i;
			
			for(int j = i+1; j<n;j++) {
				if(arr[j] < arr[min])
					min = j;
				
			}
			
			int temp = arr[min];
			    arr[min] = arr[i];
			    arr[i] = temp;
    	}
	}
	
		
	
	
}
