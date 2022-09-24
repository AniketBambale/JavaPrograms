package MockPractice;

import java.util.Scanner;

public class MockPalindrom {

	public static void main(String[] args) {
		
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number ");
		i=sc.nextInt();
	
		int j=i;
		int rev=0;
		while(i!=0)
		{
			rev=rev*10+i%10;
			i=i/10;
		}
		if(rev==j)
		{
			System.out.println("Number is Palindrome "+j);
		}
		else
		{
			System.out.println("Number is not palindrome "+j);
		}
		

	}

}
