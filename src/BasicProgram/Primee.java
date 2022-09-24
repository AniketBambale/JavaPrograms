package BasicProgram;

public class Primee {

public static void main(String[] args) {
int n=12;
		
		int i;
		int j=0;
		
		for( i=1;i<=n;i++)
		{
			  if(n%i==0)
			  {
				j++;
				
			  }
			
		}
		
		if(j==2) 
		{
			System.out.println("Number is prime");
		}
		else System.out.println("Number is not prime");
		
		
	
	}


	}


