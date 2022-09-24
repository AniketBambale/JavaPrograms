package StaticNonstatic;

import Methods.Method;

public class Static1 {
	
	

	public static void main(String[] args) {

		
		
		Static r=new Static();
				r.NonStaticM();
				System.out.println(r.d);
				System.out.println("_________________________________________");
				Static.StaticM();
				System.out.println(Static.a);
				System.out.println(Static.b);
				System.out.println();
				System.out.println();
				Method.demo();
				Method.demo(3);
				
	}

}
