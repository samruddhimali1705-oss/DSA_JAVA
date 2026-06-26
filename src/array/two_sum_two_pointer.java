package array;
import java.util.*;

public class two_sum_two_pointer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=sc.nextInt();		
		}
		int target=sc.nextInt();
		
		sum s1=new sum();
		int[] res=s1.twosum(nums, target);
		System.out.println(Arrays.toString(res));
		
		
	}
}

class sum
{
	public int[] twosum(int[] nums, int target)
	{
		int left=0;
		int right=nums.length-1;
		while(left<right)
		{
			int sum=nums[left]+nums[right];
			if(sum==target)
			{
				return new int[]{left,right};
			}
			else if (sum<target)
			{
				left++;
			}
			else
			{
				right--;
			}
		}
		return new int[]{};
	}
}