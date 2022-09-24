package AccessModifier;

public class PublicAccess2 {

	public static void main(String[] args) {
		System.out.println(PublicAccess.a);//public variable within the package
		System.out.println(PublicAccess.b);//public variable within the package
		
		PublicAccess.ab();//public method within the package
		PublicAccess.ab(3);//public method within the package
		System.out.println();
		
		//PublicAccess.abc();//private method not accessed by any other class 
		
		
		System.out.println(PublicAccess.e);
		System.out.println(PublicAccess.f);
		PublicAccess.abcd();
		PublicAccess.abcd(0);
		System.out.println();
		
		
		System.out.println(PublicAccess.e);
		System.out.println(PublicAccess.f);
		PublicAccess.abcde();
		PublicAccess.abcde(0);
		System.out.println();
		
		PublicAccess t=new PublicAccess();
		System.out.println(t.i);
		System.out.println(t.j);
		t.abcdef();
		

	}

}
