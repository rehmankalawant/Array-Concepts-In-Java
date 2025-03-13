package TheArray;

import java.util.Scanner ;
import java.util.Arrays ; 
public class ArrayEqual {

	public static void main(String[] args) {
		
		Scanner src = new Scanner (System.in) ;
		
		System.out.print("Size for Array 1 : ");
		int size1 = src.nextInt();
		
		System.out.print("Size for Array 2 : ");
		int size2 = src.nextInt();
		
	System.out.print("\nArray 1 Elements : ");
	int arr1 [] = new int [size1] ;
	for (int i=0 ; i<size1 ; i++)
	{
		arr1[i]=src.nextInt();
	}
	
	System.out.print("\nArray 2 Elements : ");
	int arr2 [] = new int [size2] ;
	for (int i=0 ; i<size2 ; i++)
	{
		arr2[i]=src.nextInt();
	}
	
	boolean result = Arrays.equals(arr1 , arr2) ;
	
	System.out.print("\nArrays Are Equal Or Not : " + result);
	
 } 
}