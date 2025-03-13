package TheArray;
import java.util.Scanner ;
import java.util.Arrays ;
public class ArraySort {

	public static void main(String[] args) {
		Scanner scr = new Scanner (System.in) ;
		int size ;
		System.out.print("Enter The Size : ");
		size = scr.nextInt();
		
		int arr1 [] = new int [size] ;
		
		System.out.print("\nEnter the Elements : ");
		for (int i = 0 ; i<size ; i++)
		{ 
			arr1[i] = scr.nextInt();
		}
		
		System.out.print("\nElements of First Array is  : ");
		for (int i = 0 ; i<size ; i++)
		{ 
			System.out.print(arr1[i] + " ");
		}
		
		Arrays.sort(arr1);
		
		System.out.print("\nElements of Second Array is  : ");
		for (int i = 0 ; i<size ; i++)
		{ 
			System.out.print(arr1[i] + " ");
		}
		
	}
}
