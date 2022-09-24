package Methods;

public class NewMethod {
	
	public static void star()
	{
char i,j;
		
		for(i='A';i<='Z';i++)
		{
			for(j='Z';j>=i;j--) {
				
			
		 System.out.print(i+" ");
			}
		
		System.out.println();
	
		}
		
	}
	public static void star(int a) {
		
		
char i,j;
		
		for(i='A';i<='Z';i++)
		{
			for(j='A';j<=i;j++) {
				
			
		 System.out.print(i+" ");
			}
		
		System.out.println();
	
		}
	}
	public static void main(String[] args) {
		star();
		star(1);

		
	}

}
