package Program37;

public class ArmstrongUsingWhile {
//Armstrong number using while loop
	public static void main(String[] args) {
		int n1=153;
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter number ");
//		n1=s.nextInt();
		int n=n1;
		int rem=0;
		int addResult=0;
		
		while(n!=0)
		{
			rem=n%10;//3/5/1
			n=n/10;//15/1/0
			addResult=addResult+(rem*rem*rem);//27+125+1//When we have to find 4 digit armstrong add *rem
		}
		
		if(n1==addResult)
		{
			System.out.println(n1+" Armstrong Number");
		}
		else
		{
			System.out.println(n1+" is not Armstrong number");
		}
}
}
