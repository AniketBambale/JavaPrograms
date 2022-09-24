package Array;

//import java.util.Scanner;

public class PrimeArray {

	public static void main(String[] args) {
		int n[]= {5,3,7,5,6};
		
		int i;
		
		for( i=0;i<n.length;i++)
		{
		    int j=0;
			for(int b=1;b<=n[i];b++)
			{
				
			
			  if(n[i]%b==0)
			  {
				j++;
				
			  }
			  
			}
			
			
			if(j==2) 
			{
				System.out.println("Number is prime"+n[i]);
			}
			
		}
		
		
		
		
	
	}

}
