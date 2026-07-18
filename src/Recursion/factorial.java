package Recursion;

public class factorial {
	public static int fact(int n) {
		if(n==1 || n==0)
		{
			return 1;
		}
		int m1= fact(n-1);
		int fn=n*m1;
		//System.out.print(fn);
		return fn;
		
	}
	public static void main(String args[])
	{
		int ans=fact(5);
		System.out.print(ans);
	}

}
