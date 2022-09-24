package BasicProgram;

public class ArrowHead {

	public static void main(String[] args) {
		
		int row=5;
	     
	     for(int i=1;i<=row;i++)
	     {
	    	 for(int j=5;j>i;j--)
	    		 
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 for(int k=5;k>=i;k--)
	    	 {
	    		 
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	    	
	     }
	     for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=i+1;k++)
				{
					System.out.print("*");
				}
				System.out.println();

			}
	}

}
