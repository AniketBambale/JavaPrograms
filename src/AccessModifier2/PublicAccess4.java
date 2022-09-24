package AccessModifier2;

import AccessModifier.PublicAccess;

public class PublicAccess4 {

	public static void main(String[] args) {
		System.out.println(PublicAccess.a);//public variable throughout the package.
		System.out.println(PublicAccess.b);//public variable throughout the package.
		
		PublicAccess.ab();//public method throughout the package without class name reference (using inheritance).
		PublicAccess.ab(0);//public method throughout the package with class reference 
		
		//System.out.println(e);//protected
		//System.out.println(f);
		//abcd();
		//abcd(0);not accessible without inheritance.
		System.out.println();
		
		PublicAccess t=new PublicAccess();
		System.out.println(t.i);
		//System.out.println(t.j);//this is not accesible it is default 
		t.abcdef();
	}

}
