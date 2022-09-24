package ForLoop;

public class ForLoop {

	public static void main(String[] args) {
		/*
      *
     **
    ***
   ****
  *****
 ******
*******
 ******
  *****
   ****
    ***
     **
      *
		 */
		
		
		
		int i,j,k,row=7;
		
		for(i=1;i<=row;i++)
		{      //k=7,6,5,4,3,2,
			for(k=row;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)//
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
