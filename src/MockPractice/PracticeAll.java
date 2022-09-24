package MockPractice;

public class PracticeAll {
	public static void main(String[] args) {
		//prime number
		/*int n=9;
		int j=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				j++;
			}
		}
		if(j==2)
		{
			System.out.println("Number is prime ");
		}
		else
		{
			System.out.println("Number is not prime");
		}*/
		
		
		
		//fractional number
		
		/*int n=5;//5x4x3x2x1
		int a=1;
		
		for(int i=1;i<=n;i++)
		{
			a=a*i;
		}
		System.out.println(a);*/
		
		//palindrome
		
		/*int n=232;
		
		int org=n;
		
		int rev=0;
		
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
			
			
			
		}
		System.out.println(rev);
		if(org==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}*/
		
		//rohmbus
		/*
		 *****
		*****
	   *****
	  *****
		 */
		/*int row=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=row;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=row;k++)
			{
				System.out.print("*");
			}
			System.out.println();

		}*/
		
		
		
		/*
		 *****
		  *****
		   *****
		    *****
		 */
		
		/*int row=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=row;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
	/*  a
		bb
		ccc
		dddd
		*/
		
		int row=4;
		
		for(char i='a';i<='d';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
