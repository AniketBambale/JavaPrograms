package ForLoop;

public class ForLoop1 {

	public static void main(String[] args) 
	{ 
		
		
		/* inverted left
		 ********
         *******
         ******
         *****
         ****
         ***
         **
         *
		 */
		int i,j,row=7;
	
		for(i=0;i<=row;i++)
		{
			for(j=row;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
