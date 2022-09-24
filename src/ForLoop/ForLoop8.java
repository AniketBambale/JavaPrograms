package ForLoop;

public class ForLoop8 {

	public static void main(String[] args) {
		
		/*
*
**
***
****
*****
******
*******
*******
******
*****
****
***
**
*
		 */
		
		
		
		
		
		int i,j,row=7;
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=i;j++)
			{
			System.out.print("*");
			
		   }
			System.out.println();
		}
		for(i=1;i<=row;i++)
		{
			for(j=row;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
