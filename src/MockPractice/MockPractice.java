package MockPractice;

public class MockPractice {

	public static void main(String[] args) {

		int i,j,k,row=9;
		
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=row;k>=(2*i-1);k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
