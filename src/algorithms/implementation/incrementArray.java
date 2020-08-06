package algorithms.implementation;

import java.util.Scanner;

public class incrementArray {

    public static void main(String[] args)
    {
        int n, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            a[i]++;
        }
        System.out.print("Elements of array after increment by 1:");
        for(i = 0; i < n - 1; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n-1]);
    }
}
