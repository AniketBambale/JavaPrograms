package Program37;

public class Diamond {
	/*
	   *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 * * * * * * *
  * * * * * * 
   * * * * * 
    * * * * 
     * * * 
      * * 
       * 
        
	 */

	public static void main(String[] args) {
		
		int row=7;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=row;k>i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
