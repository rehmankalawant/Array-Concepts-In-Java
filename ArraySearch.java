package TheArray;
import java.util.Scanner; 
public class ArraySearch {

	int indexNum ;
	
	public static void main(String[] args) {
		int i ;
		ArraySearch ref = new ArraySearch() ; 
		
		Scanner obj = new Scanner (System.in) ;
		int size , count=0 ;
		
		System.out.print("Enter The Size Of The Array : ");
		size = obj.nextInt();
		int a [] = new int [size] ;
		
		for (i=0 ; i<size ; i++)
		{
			a[i]=obj.nextInt();
		}
		
		System.out.print("\nThe Array Is : ");
		for (i=0 ; i<size ; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\nEnter The User Input : ");
		
		int userNUM = obj.nextInt();
		for (i=0 ; i<size ; i++)
		{
			if ( a[i] == userNUM) 
			{
				ref.indexNum = i ;
				count++ ;
			}
		}
		
		if (count > 0)
		{
			System.out.println("The Number " + userNUM +" Is Found In Array " + "At Position "+ ref.indexNum );
		}
		else
		{
			System.out.println("The Number " + userNUM +" Is Not Found In Array At Any Index");
		}
	}
}
