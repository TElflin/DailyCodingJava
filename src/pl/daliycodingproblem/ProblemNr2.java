package pl.daliycodingproblem;

public class ProblemNr2
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		int prod = 1;
		
		for (int i : arr)
		{
			prod *= i;
		}
		
		int[] newarr = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			newarr[i] = prod/arr[i];
		}
		
		for (int i : newarr)
		{
			System.out.println(i);
		}
	}
	
}
