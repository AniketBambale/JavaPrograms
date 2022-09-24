package MockPractice;

public class PracticeDuplicateString {

	public static void main(String[] args) {
		
		int n=151;
		int n1=n;
		int rem;
		int rev=0;
		
		while(n!=0)
		{ 
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
			
			
		}
		if(n1==rev)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("Number is not palindrom");
		}
		

	}

}
