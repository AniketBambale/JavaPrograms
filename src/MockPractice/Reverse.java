package MockPractice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		i=sc.nextInt();
		int rev=0;
		while(i!=0)
		{
			rev=rev*10+i%10;
			i=i/10;
		
		}
		System.out.println(rev+" Reverese Number is");
		

	}

}
