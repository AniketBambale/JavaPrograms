package Program37;

public class FourthQuadrantStarPattern {
	/*
	  *****
      ****
      ***
      **
      *

	 */
public static void main(String args[])
{
	int row=5;
	
	for(int i=1;i<=row;i++)
	{
		for(int j=row;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
