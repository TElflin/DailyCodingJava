package pl.daliycodingproblem.nr2;

public class ProducOfTableExceptI
{
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		int prod = 1;
		for (int i : arr)
		{
			prod *= i;
		}
		System.out.println(prod);
	}
	
}
