package AccessModifier;

public class PublicAccess {
	
	public static int a=20;//public static variable
	public static int b=10;//public static variable
	
	private static int c=40;
	private static int d=30;
	
	protected static int e=60;
	protected static int f=50;
	
	static int g=80;
	static int h=70;
	
	public int i=10;
	int j=5;
	
	
	
	
	
	public static void ab()
	{
		System.out.println("public method ");
		System.out.println("Addition is "+(a+b));
	}
	public static void ab(int z)
	{
		System.out.println("Substraction is "+(a-b));
	}
	
	
	private static void abc()
	{
		System.out.println("Addition is "+(c+d));
	}
	
	private static void abc(int x)
	{
		System.out.println("Substraction is "+(c-d));
	}
	
	protected static void abcd()
	{
		System.out.println("Protected method ");
		System.out.println("Addition is "+(e+f));
		
	}
	
	protected static void abcd(int y)
	{
		System.out.println("Substraction is "+(e-f));
	}
	
	static void abcde()//default
	{
		System.out.println("Default method");
		System.out.println(" Addition is  "+(g+h));
	}
	
	static void abcde(int w)
	{
		System.out.println("substraction is   "+(g-h));
	}
	
	public void abcdef()
	{
		System.out.println("this is public non static method ");
	}
	
	

	public static void main(String[] args) {
		System.out.println(a);//public method within class
		System.out.println(b);//
		ab();//within class public variable
		ab(3);//
		
		
		
		
		System.out.println();
		
		System.out.println(c);//private method and variable
		System.out.println(d);
		abc();
		abc(4);
		System.out.println();
		
		System.out.println(e);//protected
		System.out.println(f);
		abcd();
		abcd(0);
		System.out.println();
		
		System.out.println(g);//default
		System.out.println(h);
		abcde();
		abcde(0);
		System.out.println();
		
		//System.out.println(i);not accessible because it is non static method 
		
		PublicAccess t=new PublicAccess();
		System.out.println(t.i);
		System.out.println(t.j);
		t.abcdef();
		
		
		
		
		

	}

}
