package algorithms;

public class LeftRotateArray {
	
	
	public static void main(String[] args) {
		
		  LeftRotateArray leftRotateArray = new LeftRotateArray();
		  
		  int arr[] = {1,2,3,4,5,6,7};
		  
		  leftRotateArray.leftRotate(arr,2,7);
		  leftRotateArray.printArray(arr, 7); 
		  
		
	}

	 /* utility function to print an array */
    void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 

	private void leftRotate(int[] arr, int d, int n) {

		for(int i = 0;i < d;i ++) {
			
			leftRotateByOne(arr,n);
			
		}
		
	}

	private void leftRotateByOne(int[] arr, int n) {

		  int i,temp;
		  
		  temp = arr[0];
		  
		  for(i =0 ;i<n-1;i++) {
			  
			  arr[i] = arr[i+1];
			  
		  }
		 arr[i] =temp; 
		
		
	}

}
