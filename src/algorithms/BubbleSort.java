package algorithms;

public class BubbleSort {

	
	public static void main(String[] args) {
		int a[] = {64, 34, 25, 12, 22, 11, 90};
		
		
		BubbleSort bubbleSort = new BubbleSort();

		bubbleSort.sort(a);
		
		System.out.println(bubbleSort.printArr(a));
		 
		
	}

	private char[] printArr(int[] a) {
   
	   int n = a.length;
	   
	   for(int i = 0; i < n; ++i ) {
		   System.out.println(a[i]+ "");
		   
		   System.out.println();
		
	   }
		
		return null;
	}

	private void sort(int[] a) {

		int n = a.length;
		
		for(int i = 0 ; i < n-1 ; i++) {
			
			for(int j = 0; j < n -i -1 ; j++) {
				   
				if(a[j] > a[j+1]) {
					
					

				     int temp = a[j];
				   
				      a[j] = a[j+1];
				      
				      a[j+1] = temp;
				 
					
				}
				  
				
			      }
			
			
			}
	}
	
	
}
