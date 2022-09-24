package Program37;

public class FindLargestNumberInArray {
//find largest number in array
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,10,6};
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
				
			}
		}
		System.out.println(max);

	}

}
