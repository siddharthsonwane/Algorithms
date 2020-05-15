package algorithms;

import java.util.Arrays;

public class FindMeanMedian {
	
	
	
	
	public static void main(String[] args) {
	
		int a [] = {1,2,4,5,3,6,7,8,9};
		
		int n = a.length;
		
		System.out.println("Mean:"+findMean(a,n));
		
		System.out.println("Median:"+findMedian(a,n));
		
				
				
		
		
	}

	private static double findMedian(int[] a, int n) {
		
		Arrays.sort(a);
		
		if(n/2 != 0)
			return (double)a[n / 2];
		
		
		return (double)(  a[( n -1)/2 ] + a[ n/2]) / 2.0;
	}

	private static double findMean(int[] a, int n) {
		
		int sum = 0;
		
		for(int i = 0; i < n; i++)
			sum += a[i];
		
		
		return  (double)sum/(double)n;
	}
	
	

}
