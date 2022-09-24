package ControlStatement;

import java.util.Scanner;

public class IfAssignment {

	public static void main(String[] args) {
int a;
int b;
int c;
int d;
Scanner sc= new Scanner(System.in);

System.out.println("Enter number first");
a=sc.nextInt();

System.out.println("Enter number Second");
b=sc.nextInt();

System.out.println("Enter number Third");
c=sc.nextInt();

System.out.println("Enter number Fourth");
d=sc.nextInt();





if (a>b) 
{
	if(a>c)
	{
		if(a>d)
		{
			System.out.println("A is Greater "+a);
		}
		else
		{
			System.out.println("D is Grater "+d);
		}
		
	}
	else
	{
		if(c>d) {
		
		System.out.println("C is Greater "+c);
	             }
		else {
			System.out.println("D is greater "+d);
		}
		
	}
}
else
{
	if(b>c)
	{
	  if(b>d)
	  {
		  System.out.println("B is Greater "+b);
	  }
	  else
	  {
		  System.out.println("D is Greater "+d);
	  }
	}
	else
	{
		if(c>d) 
		{
		System.out.println(" C is Greater "+c);
		}
		else
		{
			System.out.println("D is Greater "+d);
		}
		
	}
}







	}

}
