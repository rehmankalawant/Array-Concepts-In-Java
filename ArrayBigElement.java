package TheArray;

import java.util.Scanner ;

public class ArrayBigElement {
	
	public static void main(String[] args) {
		
	Scanner src = new Scanner (System.in) ;
	
	System.out.print("Enter The Size of The Array : ");
	int size = src.nextInt();
	int arr [] = new int [size] ;
	
	System.out.print("Enter The Elements Of Array : ");
	for (int i = 0 ; i<size ; i++)
	{
		arr[i]=src.nextInt();
	}
	
	int max = arr[0] ;
	
	for (int i=1 ; i<size ; i++)
	{
		if (arr[i] > max )
		{
			max=arr[i];
		}
	}
	
	System.out.println("The Maximum Number is : " + max);

}
}