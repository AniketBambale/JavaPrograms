package Program37;

public class FindLargestNo4 {
//find largest number from 4 no's
	public static void main(String[] args) {
		int a=67,b=89,c=79,d=45;
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("Greater number is"+a);
				}
				else
				{
					System.out.println("Greater number is"+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("Greater number is"+c);
				}
				else
				{
					System.out.println("Greater number is"+d);
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println("Greater number is"+b);
				}
				else
				{
					System.out.println("Greater number is"+d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("Greater number is"+c);
				}
				else
				{
					System.out.println("Greater number is"+d);
				}
			}
		}

	}

}
