package ControlStatement;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
      int acbalance;
      System.out.println("Enter account balance ");
      acbalance =sc.nextInt();
      
      if(acbalance>=500000) {
    	  System.out.println("You have to buy Car");
      }
      else if(acbalance>=300000) {
    	  System.out.println("You have buy a Sport bike");
      }
      else if(acbalance>=200000)
      {
    	  System.out.println("You have buy a cruse bike");
    	  
      }
      else 
    	  System.out.println("You have to buy normal bike");
    	 
		sc.close();
		
		
		
		
	}

}
