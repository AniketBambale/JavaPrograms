package Program37;

import java.util.Scanner;

public class FindChartercountofString {
//find character count of string
	public static void main(String[] args) {
      String str="Aniket namdev bambale";
      int count=0;
//      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter string");
//      str=sc.next();
//      
      
    for(int i=0;i<str.length();i++)
    {
    	if(str.charAt(i)!=' ')
    	{
    		count++;
    	}
    	
    	
    	
    }
    System.out.println(count);
      
	}

}
