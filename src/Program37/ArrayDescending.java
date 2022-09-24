package Program37;


public class ArrayDescending {
//sort array in descending order
	public static void main(String[] args) {

		int[] arr= {1,9,3,7,5};
	int temp=0;
	for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];//1
					arr[i]=arr[j];//2
					arr[j]=temp;
				}
			}
		}
	for(int i=0;i<arr.length;i++) //for(int i=arr.length-1;i>=0;i--)for ascending change that only
	{
		
	
		System.out.println(arr[i]);
		
	}
	}

}
