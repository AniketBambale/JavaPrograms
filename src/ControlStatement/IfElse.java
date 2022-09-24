package ControlStatement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		double a,b,c,d,e;
		double per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marathi subject marks   ");
		a=sc.nextInt();
		
		System.out.println("Enter Hindi subject marks   ");
		b=sc.nextInt();

		System.out.println("Enter English subject marks   ");
		c=sc.nextInt();
		
		System.out.println("Enter Science subject marks   ");
		d=sc.nextInt();
		
		System.out.println("Enter Social Science subject marks   ");
		e=sc.nextInt();
		
		double tmarks=a+b+c+d+e;
		System.out.println("Total marks are "+tmarks);
		
		per=(tmarks/500)*100;
				System.out.println("Percentage is "+per);
				
			if(per>=75)	
		{
				System.out.println("You got Distinction ");
				
			}
			else if(per>=60)
          {
	      System.out.println("You Got first class ");
           }
			else if(per>=50)		
			{
				System.out.println("You Got Second class ");
			}
			
			else if(per>=35)
			{ 
				System.out.println("You got passed class ");
			}
			
			
			else System.out.println("You Failed!!!!");
			
	}

}
