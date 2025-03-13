package TheArray;
import java.util.Scanner ;
public class ArrayAvg {

public static void main(String[] args) {
	
	Scanner obj = new Scanner (System.in);
	
	int i ;
	int size;
	int Asum=0;
	
	System.out.print("Enter the Size : ");
	size = obj.nextInt();
	int a [] = new int [size];
	
	System.out.print("\nEnter the Elements : " );
	for (i=0 ; i<size ; i++)
	{
	a [i] = obj.nextInt();
	}

	System.out.print("\nArray is : " );
	for (i=0 ; i<size ; i++)
	{
	System.out.print(a[i] + " ");
	}
	
	for (i = 0 ; i<size ; i++)
	{
	 Asum = a[i] + Asum ;	
    }
	
	int Average = Asum / size ;
	
	System.out.println("Sum is : " + Asum);
	
	System.out.print("\nThe Average of Array is : " + Average);



}


	
}

