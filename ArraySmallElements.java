package TheArray;

import java.util.Scanner ;

public class ArraySmallElements {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner (System.in) ;
		
		System.out.println("Enter the size of the Array : ");
		int size = sr.nextInt();
		
		int  arr [] = new int  [size];
		
	System.out.println("Enter the Element from the Array  : ");
	for (int i =0 ; i <size ; i++)
		{
			arr[i] = sr.nextInt();
		}
	
	int min = arr[0] ;
	
	for (int i = 1 ; i<size ; i++)
	{
		if (min > arr[i] )
		{
			min = arr[i] ;
		}
	}
		System.out.println("Minimum Value Is " + min );   
	}
}
