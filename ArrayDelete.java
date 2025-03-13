package TheArray;
import java.util.Scanner ;
public class ArrayDelete {
	
public static void main(String[] args) {
	
	Scanner src = new Scanner (System.in);
	
	System.out.print("Enter the Array Size : ");
	int size = src.nextInt();
	
	int arr[] = new int [size] ;
	System.out.print("Enter the Array Elements : ");
	for (int i=0 ; i<size ; i++)
	{
		arr[i] = src.nextInt();
	}
	
	System.out.print("The Array Is : ");
	for (int i=0 ; i<size ; i++)
	{
		System.out.print(arr[i] + " ");
	}
	System.out.print("\nEnter the Location For Delete : ");
	int indexDEL = src.nextInt();
	
	for (int i=indexDEL ; i<size-1 ; i++)
	{
		arr[i] = arr[i+1] ;
	}
	
	size--;
	
	System.out.print("The Modified Array Is : ");
	for (int i=0 ; i<size ; i++)
	{
		System.out.print(arr[i] + " ");
	}
	
}

}
