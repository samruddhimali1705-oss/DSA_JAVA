package array;

public class remove_duplicates_in_sortedaray_leetcode3 {
	public static void main(String args[])
	{
		int[] nums= {2,3,3,4,4,5,5,5};
		int i=0;
		for(int j=1;j<nums.length;j++)
		{
			if(nums[j]!=nums[i])
			{
				i++;
				nums[i]=nums[j];
			}
		}
		int k=i+1;
		for(int i1 =0;i1<k;i1++)
		{
			System.out.print(nums[i1]+" ");
		}
	}

}
