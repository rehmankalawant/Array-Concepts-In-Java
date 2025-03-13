package TheArray;

import java.util.Scanner ;
public class ArrayDSC {
	
	public static void main(String[] args) {
	
	Scanner scr = new Scanner (System.in) ;
int size ;
System.out.print("Enter The Size : ");
size = scr.nextInt();

int a[]= new int [size];

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

for (int i=0; i<size; i++)
{
	for (int j=i+1; j<size; j++)
	{
		if (a[i]<a[j])
		{
			int temp = a[i];
			a[i]=a[j] ;
			a[j]=temp ;
		}
	}
}
System.out.print("\nThe Descending Ordered Array : ");
   for (int i = 0 ; i<size ; i++)
  {
	System.out.print(a[i] + " ");
  }
}
}