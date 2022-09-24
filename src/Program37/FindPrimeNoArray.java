package Program37;

public class FindPrimeNoArray {
//prime number from array
	public static void main(String[] args) {
     
		int arr[]= {1,2,3,4,5,11};
		
		
		for(int i=0;i<arr.length;i++)
		{
			int m=0;
		for(int j=1;j<=arr[i];j++)
		{
			if(arr[i]%j==0)
			{
				m++;
			}
		}
		
		if(m==2) 
		{
			
		
		System.out.println("prime numbers"+arr[i]);
		}
		
		
		}	
		
	}

}
