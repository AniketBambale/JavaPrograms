package Program37;

public class FindDuplicateString {
//find duplicate string from array
	public static void main(String[] args) {
		
		boolean a=false;
		 String arr []= {"arun","dukare","arun","arun"};
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=i;j<arr.length-1;j++)
			 {
				 if(arr[i]==arr[j+1])
				 {
					 System.out.println(arr[i]);
					  a=true;
					  
				 }
				 
			 }
		 }
		 if(a==false)
		 {
			 System.out.println("no");
		 }
	}

}
