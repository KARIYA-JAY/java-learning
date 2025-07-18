package Array;

public class Secondlarge {


static private void getElements(int[] arr, int n)
{
if (n == 0 || n==1)
	{
		System.out.print(-1);
		System.out.print(" ");
		System.out.print(-1);
		System.out.print("\n");
	}
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0;i < n;i++)
	{
		large = Math.max(large,arr[i]);
	}
	for (i = 0;i < n;i++)
	{
		if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}

	System.out.println("Second largest is "+second_large);
}
public static void main(String[] args)
{
	int[] arr = {12,35,1,36,10,34,2};
	int n = arr.length;
	getElements(arr, n);
}
}
