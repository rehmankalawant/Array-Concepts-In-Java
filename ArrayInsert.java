package TheArray;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		Scanner srk = new Scanner (System.in);
		
		System.out.print("Enter the Size : ");
		int size = srk.nextInt();
		
		int a [] = new int [size+1];
		
		System.out.println("\nEnter the array Elements : ");		
		for (int i = 0 ; i<size ; i++)
		{
			a[i]=srk.nextInt();
		}
		
		System.out.print("\nThe Array is  : ");		
		for (int i = 0 ; i<size ; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\nOriginal Size is : " + size );
		
		System.out.print("\nEnter Array Location : ");
		int pos = srk.nextInt();
		
		System.out.print("\nEnter Array Element : ");
		int elem = srk.nextInt(); 
		
		
		for (int i=size; i>pos ; i--)
		{
			a[i]=a[i-1] ;
			
		}
		
		a[pos] = elem ;
		size++ ;
        			
		System.out.print("\nThe Modified Array is  : ");		
		for (int i = 0 ; i<size ; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\nModified Size is Now : " + size );
	}
	
}
