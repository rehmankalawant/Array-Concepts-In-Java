package TheArray;

import java.util.Scanner ;
import java.util.Arrays ;

public class ArrayCopyTo {
	
public static void main(String[] args) {

	Scanner src = new Scanner (System.in);
	
	System.out.print("Enter The Size Of First Array : ");
	int size1 = src.nextInt();
	int arr1[] = new int [size1] ;
	
	System.out.print("Enter First Array Elements : ");
	for (int i=0 ; i<size1 ; i++)
	{
		arr1[i]= src.nextInt();
	}
	
	System.out.print("Enter The Size Of Second Array : ");
	int size2 = src.nextInt();
	int arr2 [] = Arrays.copyOf(arr1 ,size2) ;
	
	
	System.out.print("Second ARRAY is  : ");
	for (int i=0 ; i<size1 ; i++)
	{
		System.out.print(arr2[i] + " ");
	}
	
	
	
}
}
