package TheArray;

import java.util.Scanner ;

public class ReverseString {
	
	public static void main(String[] args) {
	
		String reverse = " ";
	
	Scanner obj = new Scanner (System.in); 
	
	System.out.println("Enter A String : ");
	String a = obj.next();
	
	System.out.println(a);
	System.out.println("Length is " + a.length());
	
	for (int i=a.length()-1 ; i>=0 ; i--)
	{
		char ch = a.charAt(i) ;
		
		System.out.println(ch);
		reverse = reverse + ch ;
		System.out.println(reverse);
	}
	
	System.out.println("The Reverse Is : " + reverse );
	
}
}
