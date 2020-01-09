package pl.daliycodingproblem;


public class ProblemNr2
{
	public static void main(String[] args)
	{
		int[] input = {1, 2, 3, 4, 5};
		int[] product = new int[input.length];
		int prod = 1;
		
		for (int i = input.length -1; i >=0; i-- )
		{
			product[i] = prod;
			prod *= input[i];
		}
		
		prod =1;
		for(int i = 0; i < product.length; i++)
		{
			product[i] *= prod;
			prod *= input[i];
		}
		
		for (int i : product)
		{
			System.out.println(i);
		}
	}
	
}
