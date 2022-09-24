package Program37;

public class FindDuplicateNoArray {
//find duplicate number from Array
	public static void main(String[] args) {
         boolean a=false;
		 int arr []= {1,3,5,6};
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
