package MockPractice;

public class MethodP1 {
	static int i;
	static int j;
	static int k;
	
	MethodP1()//1 constructor
	{
		i=30;
		j=40;
		k=50;
		
	}
	MethodP1(int r)//2 constructor
	{
		i=10;
		j=20;
		k=30;
	}
	
	protected static void ab( )//Static method
	{
		System.out.println(i+j);
		
	}
	 void ab(int m)
	{
		System.out.println(i+j+k);
	}
	

	public static void main(String[] args) {
	new MethodP1(4);//constructor calling
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	
	ab();
	
	MethodP1 m=new MethodP1();
	
	new MethodP1(3);
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	m.ab(3);
	
		
		
		

	}

}
