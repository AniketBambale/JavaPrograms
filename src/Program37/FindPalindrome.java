package Program37;

public class FindPalindrome {
//palindrome number
	public static void main(String[] args) {

		int n=121;
		 int temp=n;
		int rem;
		int sum=0;
		
		while(n!=0)
		{
			rem=n%10;
		
			n=n/10;
		
			sum=sum*10+rem;
			
		}
		
	if(sum==temp)
	{
		System.out.println("number is palindrome ");
	}
	else System.out.println("Number is not palindrome");
		
	}

}
