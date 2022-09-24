package Array;
//finding largest number of array
public class LargestNum {

	public static void main(String[] args) {
		
		int a[]= {55,44,73,6,5};
		
		int j=a.length;
		System.out.println("Length of array "+j);
		
		for(int i=0;i<j;i++)
		{
			System.out.println(a[i]);
			
		}
		
		if(a[0]>a[1])
		{
			if(a[0]>a[2])
			{
				if(a[0]>a[3])
				{
					if(a[0]>a[4])
					{
						System.out.println(a[0]);
					}
					else 
					{
						System.out.println(a[4]);
					}
				}
				else
				{
					if(a[3]>a[4])
					{
						System.out.println(a[3]);
					}
					else
					{
						System.out.println(a[4]);
					}
				}
			}
			else {
				if(a[2]>a[3])
				{
					if(a[2]>a[4])
					{
						System.out.println(a[2]);
					}
					else System.out.println(a[4]);
				}
				else
				{
					if(a[3]>a[4])
					{
						System.out.println(a[3]);
					}
					else System.out.println(a[4]);
				}
				
				
			}
			
		}
		else if(a[1]>a[2])
		{
			if(a[1]>a[3])
			{
				if(a[1]>a[4])
				{
					System.out.println(a[1]);
				}
				else System.out.println(a[4]);
			}
			else 
				if(a[3]>a[4])
			{
				System.out.println(a[3]);
			}
				else System.out.println(a[4]);
			
		}
		else {
			if(a[2]>a[3])
			{
				if(a[2]>a[4])
				{
					System.out.println(a[2]);
				}
				else System.out.println(a[4]);
			}
			else if(a[3]>a[4])
			{
				System.out.println(a[3]);
			}
			else System.out.println(a[4]);
		}

	}

}
