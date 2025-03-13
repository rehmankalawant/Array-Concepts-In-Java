package TheArray;

import java.util.Scanner ;

public class StringPallandrome {
	
	public static void main(String[] args) {
	
		String reverse = "";
	
	Scanner obj = new Scanner (System.in); 
	
	System.out.print("Enter A String : ");
	String a = obj.next();

	
	System.out.println(a);
	System.out.println("Length is " + a.length());
	
	for (int i=a.length()-1 ; i>=0 ; i--)
	{
		char ch = a.charAt(i) ;
		
		//System.out.println(ch);
		reverse = reverse + ch ;
		//System.out.println(reverse);
	}
	
	System.out.println("The Reverse Is : " +reverse );
	
	if (reverse.equals(a))   
	{
		System.out.println("The Word " + a + " Is A Palindrome");
	}
	else
	{
		System.out.println("The Word "  + a + " Is Not A Palindrome");
	}
}
}

