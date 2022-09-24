package Program37;

public class FindPrimeNo {
//prime number
	public static void main(String[] args) {
		int n=12;
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
			System.out.println("Given number is prime");
		}
		else System.out.println("Given number is not prime");
		
	}

}
