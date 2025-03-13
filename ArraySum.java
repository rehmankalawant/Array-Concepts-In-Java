package TheArray;

import java.util.Scanner ;

public class ArraySum {
	
	static int size;
	static int i; 
	
	static int sumArray = 0 ;
	
	public static void main(String[] args) {
		
	Scanner obj = new Scanner (System.in);
	
	System.out.print("Enter the size of the array : ");
	size = obj.nextInt();
	
	int a[] = new int [size] ;
	
	for (i=0 ; i<size; i++)
	{
		a[i]= obj.nextInt();
	}
	
	System.out.print("\nThe Array A is : ");
	for (i=0 ; i<size; i++)
	{
		System.out.print(a[i] + " ");
	}
	
	for (int i=0; i<size; i++)
	{
		sumArray = a[i] + sumArray ;  
	}
		
	System.out.println("\nArray Sum Is : " + sumArray);
}

}
