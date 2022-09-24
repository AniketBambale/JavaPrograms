package String;

public class StringBasics {

	public static void main(String[] args) {

		String s=new String("Aniket");//Declaration with object
		String p=new String("aniKeeT");
		
		System.out.println(p==s);
		 
		System.out.println(s);
		
		String str="Bambale";//declaration only
		String abc="Bambale";
		System.out.println(str);
		
		System.out.println(abc==str);
		
		System.out.println(s.toUpperCase());//toupper case 
		
		System.out.println(s.toLowerCase());//tolowercase
		
		System.out.println(s.equals(p));//toequals Aniket=Aniket.
		
		System.out.println(s.equalsIgnoreCase(p));//Aniket=aniKeT
		
	  int c=p.indexOf('e');//index of character
	  System.out.println(c);
	  
	  int d=p.lastIndexOf('e');//last index of
	  System.out.println(d);
	  
	 char g= p.charAt(4);//find character with help of index 
	 System.out.println(g);
	 
	 
	 
	 
	 
	  
	  
	}

}
