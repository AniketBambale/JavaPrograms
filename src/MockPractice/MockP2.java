package MockPractice;

public class MockP2 extends MethodP1 {
	

	public static void main(String[] args) {
		
		//new MethodP1();
		
		
    MethodP1 d= new MethodP1();//object creation for non static method and constructor
		
    
        MethodP1.ab();//Method calling from another class
        
        
        
		System.out.println("First constructor"+MethodP1.i);
		System.out.println(MethodP1.j);
		System.out.println(MethodP1.k);

		
		new MethodP1(7);//constructor calling from another class
		System.out.println("Second construtor"+MethodP1.i);
		System.out.println(MethodP1.j);
		System.out.println(MethodP1.k);
		d.ab(7);
		
		
	}

}
