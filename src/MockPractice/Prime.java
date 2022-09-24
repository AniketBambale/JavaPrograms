package MockPractice;
//prime number program...
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
//		int n;
//		Scanner d=new Scanner(System.in);
//		
//		System.out.println("Enter number ");
//		
//		n=d.nextInt();
//		
		int n=7;
		int j=0;//67-1,2,3,4,5,6
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				j++;//1,2
			}
		}
		if(j==2) {
			System.out.println("Number is prime");
		}
		else System.out.println("Number is not prime");
		
		
		}    
	}


