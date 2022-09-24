package ForLoop;

public class ForLoop4 {

	public static void main(String[] args) {
		
		/*
		 
		 * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
		 */
		
        int i,j,k,row=7;
		
		for(i=1;i<=row;i++)
		{
			for(k=row;k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
