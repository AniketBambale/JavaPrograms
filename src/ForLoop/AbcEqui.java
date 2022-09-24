package ForLoop;

public class AbcEqui {

	public static void main(String[] args) {

		char i,j,k;
		 
		for(i='A';i<='Z';i++)
		{
			for(j='Z';j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k='A';k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}

}
