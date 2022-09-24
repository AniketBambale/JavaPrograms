package MockPractice;

public class MockPr1 {
	public static void main(String[] args) {
		          
		int a[]= {3,4,5,6,5,6,7};
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nArray reverse");
		int r=a.length;
		for(int i=(r-1);i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
