package ControlStatement;

import java.util.Scanner;

public class NestedStat{

	public static void main(String[] args) {
		double a,b,c,d,e,per,tmarks;
		Scanner sc=new Scanner(System.in);
		
				System.out.println("Enter marathi marks ");
		        a= sc.nextInt();
		
		        System.out.println("Enter Hindi marks ");
		        b= sc.nextInt();
		        
		        System.out.println("Enter english marks ");
		        c= sc.nextInt();
		
		        System.out.println("Enter science marks ");
		        d= sc.nextInt();
		        
		        System.out.println("Enter Social science marks ");
		        e= sc.nextInt();
		
		tmarks=a+b+c+d+e;
		System.out.println("Total marks "+tmarks);
		
		per=(tmarks/500)*100;
		System.out.println("Percentage "+per);
		
		if (per>=75)
		{
			System.out.println("Take admission to science");
			
		if(per>90) {
			System.out.println("Div A");
		
		}
		else if(per>80) {
			System.out.println("Div B");
		}
		else System.out.println("Div C");
			
			
	    }
		else if(per>=60)
		{
			System.out.println("Take admisssion to commerce ");
			
			if(per>70)
			{
				System.out.println("Div A comm");
			}
			else if (per>60) {
				System.out.println("Div B comm");
			}
		}
		else if(per>=50) {
			
			System.out.println("Take admission to Arts ");
			if(per>55)
			{
				System.out.println("Div A art");
			}
			else System.out.println("Div b");
			
		}
		else if(per>35)
		{
			System.out.println("Take admission to MCVC");
			
			if(per>45) {
				System.out.println("Div A MCVC");
			}
			else System.out.println("Div B MCVC");
		}

	}
	
	}
