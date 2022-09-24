package AccessModifier2;

import AccessModifier.PublicAccess;

public class PublicAccess3 extends PublicAccess{

	public static void main(String[] args) {
	
		System.out.println(PublicAccess.a);//public variable throughout the package.
		System.out.println(PublicAccess.b);//public variable throughout the package.
		
		PublicAccess.ab();//public method throughout the package without class name reference (using inheritance).
		PublicAccess.ab(0);//public method throughout the package with class reference 
		
		System.out.println(e);//protected
		System.out.println(f);
		abcd();
		abcd(0);
		System.out.println();
		
		
		System.out.println(PublicAccess.e);//default variable can access out side the class using inheritance
		System.out.println(PublicAccess.f);
		//PublicAccess.abcde();//not accessible default method 
		//PublicAccess.abcde(0);
		PublicAccess3 v=new PublicAccess3();
		v.abcdef();
		
		
	}

}
