package relationshipOperator;

import java.util.Scanner;

public class ComparisionOperator {

	public static void main(String[] args) {
		int a,b;	
   boolean result;
   //result=a<b;
   char operator=5;
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter first Number..");
  a=sc.nextInt();
  System.out.println("Enter Second Number...");
  b=sc.nextInt();
 

   
	if(result=a>b) {
	System.out.println("first number is Greater than second");
	}
	else 
		//result=a<b;
	   System.out.println("first number is lower than second");
	sc.close();
	}

}

