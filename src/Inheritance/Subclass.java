package Inheritance;

public class Subclass extends SingleLevel {
	 int a=30;
	
	public  void abc()
	{
		System.out.println(super.a);
		System.out.println("Aniket Subclass");
	}

	public static void main(String[] args) {
		SingleLevel r=new SingleLevel();
		r.ab();
		int a=40;
		
		//System.out.println(this.a);
	}

}
