package MockPractice;

public class Palindrome {

	public static void main(String[] args) {
		int n=454;//
		int m=n;
		int rev=0;
		while(n!=0)//454,45,4,0..
		{	
		 rev=rev*10+n%10;//4 40+5=45 450+4=454 
		 n=n/10;//45/10=4
		}
		if(rev==m)
		{
			System.out.println("Number is palindrome ");
		}
		else
		{
			System.out.println("Number is not palindrome ");
		}
		
		
	}

}