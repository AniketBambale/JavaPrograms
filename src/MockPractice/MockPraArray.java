package MockPractice;
//Finding maximum number from array
public class MockPraArray {

	public static void main(String[] args) {
		int a[]= {3,89,69,90};
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
		}
		
		if(a[0]>a[1])
		{
			if(a[0]>a[2])
			{
				if(a[0]>a[3])
				{
					System.out.println(a[0]);
				}
				else System.out.println(a[3]);
				
			}else
			{
				if(a[2]>a[3])
				{
					System.out.println(a[2]);
				}
				else {
					System.out.println(a[3]);
				}
			}
		}
			else
			{
				if(a[1]>a[2])
				{
					if(a[1]>a[3])
					{
						System.out.println(a[1]);
					}
					else System.out.println(a[3]);
				}else
				 {
					if(a[2]>a[3])
					{
						System.out.println(a[2]);
					}
					
					
					
					else {
						System.out.println(a[3]);
					}
					}
				}
			}
}
		
		
		
	




