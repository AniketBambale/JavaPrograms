package Program37;

public class LowerPyramid {
	/*
	 *  *********
         *******
          *****
           ***
            *
	 */

	public static void main(String[] args) {
		
		int row=9;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=row;k>=2*i-1;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
				
		}
		
	}

}
