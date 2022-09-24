package Program37;

public class FindLCMandHCF {
//find the lcm and hcf 
	public static void main(String[] args) {
		int x=48;
		int y=8;
		int temp,hcf,lcm;
		int a=x;
		int b=y;
		     //6
		while(b!=0)
		{
			temp=b;//8,
			b=a%b;//48%8=0
			a=temp;//8
			
		}
     hcf=a;//gcd
     lcm=(x*y)/hcf;
       
     System.out.println("HCf is "+hcf);
     
     System.out.println("Lcm is "+lcm);
     
	}

}
