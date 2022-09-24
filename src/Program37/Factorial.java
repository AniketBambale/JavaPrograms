package Program37;
//factorial of number
public class Factorial {

	public static void main(String[] args) {
      int n=4;
      
      
      for(int i=1;i<=n;i++)
      {
    	  for(int j=i;j<=n;j++)
    	  {
    		i=i*j;  
    	  }
    	  System.out.println(i);
      }
      
	}

}
/*int n=5;//5x4x3x2x1
int a=1;

for(int i=1;i<=n;i++)
{
	a=a*i;
}
System.out.println(a);*/
