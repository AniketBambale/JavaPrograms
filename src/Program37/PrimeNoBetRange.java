package Program37;

public class PrimeNoBetRange {

	public static void main(String[] args) {
     int n=20;
     
     
     
     for(int i=1;i<=n;i++)
     {
    	 int k=0;
    	 for(int j=1;j<=n;j++)
    	 {
    		if(i%j==0)
    		{
    			k++;
    		}
    		
       	 }
    	 
    	 if(k==2)
       	 {
       		 System.out.println(i);
    	 }
    	 
    	 
    	 }
     
     
     
     
     
     
     
     
     
     
	}

}
