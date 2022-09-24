package StaticNonstatic;

public class Static {
	static int a;
	static int b;
	 int c;
	 char d;
	  
	 Static()
	 {
		 a=67;
		 b=56;
		 c=55;
		 d='A';
	 }
	 
	 //
	 public static void StaticM()//Static method
	 {
		 
		 System.out.println("You called Static method ");
		 
	 }
	 public void NonStaticM()//non static method 
	 {
		 System.out.println(c);
	 }
	

	public static void main(String[] args) {

		
		StaticM();
		
	 System.out.println(b);
	 System.out.println(a);
	 System.out.println("================================");
		Static s=new Static();

		s.NonStaticM();
		System.out.println(s.c);
		System.out.println(s.d);
		
		
	}

}
