package Program37;

public class StringReverseAtSamePosition {
//Reverse string at same position
	public static void main(String[] args) 
	{
		String str="Aniket Bambale";
		
		String ar[]=str.split(" ");
		
		String revs=" ";
		
		for(int i=0;i<ar.length;i++)
		{
			String st=ar[i];
			String rev=" ";
			
			for(int j=st.length()-1;j>=0;j--)
			{
				rev=rev+st.charAt(j);
			}
			revs=revs+rev;
			
		}
		System.out.println(revs);
		
		
	}

}
