package MockPractice;

public class Mock13 {
	public static int q;
	public static int r;
	char s;
	
	
protected Mock13()
	{
		q=23;
		r=24;
		s='A';
		
	}
Mock13(int r)
{
	q=12;
	r=13;
}
	
	
	public static void Ab()
	{
		System.out.println("Aniket");
	}

	public static void main(String[] args) {
	
		Ab();
		new Mock13();
	 
	System.out.println(q+r);
		

	}

}
