package TheArray;
import java.util.Scanner;
public class ReverseNumber {

	
	
	public static void main(String[] args) {
		
		 int num,rev=0 , remainder ;
		
		System.out.println("Enter Any Number : ");
		Scanner obj = new Scanner (System.in);
		num = obj.nextInt();
		
		obj.close();
		
		while (num>0)
			
		{	
			remainder = num % 10 ;
		
			rev = rev * 10 + remainder ;
		
		    num = num/10;
		 
		    System.out.println("remi: "+ remainder);
		    
		    System.out.println(num + "  ");
		}
		
		 System.out.println("reverse number is : "+ rev);
		
		 
			 }
	}
