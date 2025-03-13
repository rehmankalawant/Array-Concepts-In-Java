package TheArray;

import java.util.Scanner ;

public class CopyingArray {
	
	public static void main(String[] args) {
		
		Scanner objj = new Scanner (System.in) ;
		int a [] = new int [3] ;
		
		int b [] = new int [3] ;
		
		System.out.println("Enter The values For The Array : ");
		for ( int i=0; i<a.length; i++)
		{
			a [i] = objj.nextInt();
			
		}
		
		System.out.print("\n The First Array is : ");
		for (int i=0 ; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\n The Second Array is : ");
		for ( int i=0 ; i<b.length ; i++ )
		{
			b[i] = a[i] ;
			
			System.out.print(b[i] + " ");
		}
	}

}
