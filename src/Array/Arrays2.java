package Array;

public class Arrays2 {
	public static void main(String args[])
	{
		int []a= {1,2,3,4,5};
		//System.out.println(a[1]);
		int j=a.length;
		System.out.println(j);
		
		//for(int i=0;i<a.length;i++)
		//{
		//	System.out.println(a[i]);
		//}
		
		System.out.println();
		 
		
		
		for(int i=(a.length-1);i>=0;i--)//reverse array
				{
	                 System.out.println(a[i]);		
				}
		
		
	}

}
