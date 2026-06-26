package array;
import java.util.*;

public class two_sum_leetcode_1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();		
			
		}
		int target=sc.nextInt();
		
		sol s1=new sol();
		int res[]=s1.twosum(nums,target);
		System.out.print(Arrays.toString(res));
		
		
	}
}
	class sol
	{
		public int[] twosum(int[] nums, int target)
		{
			for(int i=0;i<nums.length;i++)
			{
				for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]+nums[j]==target)
					{
						return new int[]{i,j};
					}
				}
			}
			return new int[]{};
		}
		
	}
	


