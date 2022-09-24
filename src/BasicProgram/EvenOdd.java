package BasicProgram;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number..");
	    a=sc.nextInt();
	    if((a/2)*2==a)
	    {
	    	System.out.println("Given number is even");
	    
	    }
	    else
	    	System.out.println("Given number is odd");
	    sc.close();
	}

}
