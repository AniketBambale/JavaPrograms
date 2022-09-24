package Program37;

import java.util.Scanner;

public class ReverseStringScanner {
//Reverse String using scanner 
	public static void main(String[] args) {
		String str;
		String rev=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string here..");
		str=sc.next();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println("Reverse string is "+rev);

		
	}

}
