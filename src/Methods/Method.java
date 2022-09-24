package Methods;

import java.util.Scanner;

public class Method {
	public static void demo()
	{
		int i,k,a;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter value  ");
		i=sc.nextInt();
		
		System.out.print("Enter value  ");
		k=sc.nextInt();
		a=i+k;
		System.out.println("Total is "+a);
	}
	public static void demo(int h)
	{ 
		int i,k,j,d;
        Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter value  ");
		i=sc.nextInt();
		
		System.out.print("Enter value  ");
		k=sc.nextInt();
		
		System.out.print("Enter value  ");
		j=sc.nextInt();
		
		d=i+j+k;
		System.out.println("\t"+d);
	}

	public static void main(String[] args) {
		
		demo();
		demo(10);

	}
	
}
