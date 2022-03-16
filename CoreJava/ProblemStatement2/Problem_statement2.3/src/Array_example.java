
public class Array_example {

	public static void main(String[] args) 
	{
		int[] arr = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		int sum=0;
		
		for(int i=0;i<arr.length-3;i++)
		{
			sum=sum+arr[i];
			
			
		}
		System.out.println("sum="+sum);
		System.out.println();
		float avg=sum/15;
		System.out.println("average="+avg);
		System.out.println();
	
		for(int i = 0; i<arr.length-3; i++ )
		{
		    for(int j = i+1; j<arr.length-3; j++)
		    {
		            if(arr[i]>arr[j])
		            {
		              int temp = arr[i];
		               arr[i] = arr[j];
		               arr[j] = temp;
		            }
				
				
			}
		
			
		}
		System.out.println("smalest number is:"+arr[0]);
		arr[17]=arr[0];
	
		
		arr[16]=(int) avg;
		arr[15]=sum;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	

	}

}