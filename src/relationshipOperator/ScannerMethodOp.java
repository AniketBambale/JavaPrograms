package relationshipOperator;

import java.util.Scanner;

public class ScannerMethodOp {

	public static void main(String[] args) {
		char operator;
		
		int a,b,c;
		//addition 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no..");
		a=sc.nextInt();
		System.out.println("Enter second no...");
		b=sc.nextInt();
		System.out.println(" Enter Operator ");
		operator=(char) sc.nextDouble();
		//operator=sc.next().charAt(0);
		//sc.close();
		
		switch(operator)
		{
		case '+':
		c=a+b;
		System.out.println("addition is equal to..."+c);
		break;
		case '-':
		c=a-b;
		System.out.println("substraction is..."+c);
		break;
		case '*':
		c=a*b;
		System.out.println("multiplication is..."+c);
		break;
		case '/':
		c=a/b;
		System.out.println("division is.."+c);
		break;
		default:System.out.println("Wrong choice");
			
			
	}
sc.close();
}
	}
