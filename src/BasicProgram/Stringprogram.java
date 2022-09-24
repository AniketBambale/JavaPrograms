package BasicProgram;

public class Stringprogram {

	public static void main(String[] args) {

		String c="aniket@";
		
		String str=c.toLowerCase();
		
		
		String n="";
		
		for(int i=0;i<str.length();i++)
		{
			
		char a=	str.charAt(i);
		
		for(char b='a';b<='z';b++)
		{
			
			if(a==b)
			{
				n=n+a;
				
				
			}
			
			
		}
		//System.out.println(n);
			
		}
		System.out.println(n);
		
		
		 
		
	}

}
