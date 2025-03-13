package TheArray;
import java.util.Scanner;
public class ArrayASC {
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		int size = scr.nextInt();
		int a[] = new int [size];
		
		System.out.print("Enter the Elements : ");
		for (int i = 0 ; i<size ; i++)
		{
			a[i]=scr.nextInt();		
	    }
		
		System.out.print("The Array : ");
		for (int i = 0 ; i<size ; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\nThe Ascending Array is  : ");
		for (int i = 0 ; i<=size ; i++)
		{
			for (int j = i+1 ; j<=size ; j++)
			{
				if (a[i] > a[j])
				{
					int temp = a[i] ;
					a[i] = a[j] ;
					a[j] = temp ;
				}
			}
		}
		
		for (int i = 0 ; i<size ; i++)
		{
			System.out.print(a[i] + " ");
		}
}
}