package MockPractice;

public class MockPractice3 {

	public static void main(String[] args) {
    int i,j,k,row=7;
     
    for(i=1;i<=row;i++)
    {
    	for(j=row;j>i;j--)
    	{
    		System.out.print(" ");
    	}
    	for(k=1;k<=i;k++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    for(i=1;i<=row;i++)
    {
    	for(j=1;j<=i;j++)
    	{
    		System.out.print(" ");
    	}
    	for(k=row;k>i;k--)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    
    
	}

}
