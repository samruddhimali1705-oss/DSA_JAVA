package array;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] num= new int[n];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		int max=num[0];
		int min=num[0];
	
		
		//display array elements
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		
		System.out.println(" ");
		
		//reverse array elements
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.print(num[i]+" ");
		}
		
		System.out.println(" ");
		
		//Find maximum in array
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
			 
		}
		System.out.println("Maximum "+max);
		
		//Find minimum in array
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println("Minimum "+min);
		
		//Find Even in array
				for(int i=0;i<num.length;i++)
				{
					if(num[i]%2==0)
					{
						System.out.println("Even no in array: "+num[i]+" ");
					}
				}
		//Find Odd in array
				for(int i=0;i<num.length;i++)
				{
					if(num[i]%2!=0)
					{
						System.out.println("Odd no in array: "+num[i]+" ");
					}
				}
				
		//Sum of array elements
				int sum=0;
				for(int i=0;i<num.length;i++)
				{
					sum=sum+num[i];
				}	
				System.out.println("Sum of Array elememnt: "+sum );
				
		sc.close();
	}

}
