//Given an array of integers, find the first missing positive integer in linear time and constant space.
//In other words, find the lowest positive integer that does not exist in the array.
//The array can contain duplicates and negative numbers as well.
//For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
//You can modify the input array in-place.

package pl.daliycodingproblem;

import java.util.ArrayList;

public class ProblemNr4
{
//	static int lowestPositiveInteger(ArrayList<Integer> lOF);

	public static void main(String[] args)
	{
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(3);
		listOfIntegers.add(4);
		listOfIntegers.add(-1);
		listOfIntegers.add(1);

		int anwser;
		anwser = lowestPositiveInteger(listOfIntegers);
		System.out.println("Lowest positive integer is :" + anwser);

	}

	static int lowestPositiveInteger(ArrayList<Integer> listOfIntegers)
	{
		for (int currentIndex = 0; currentIndex < listOfIntegers.size(); currentIndex++)
		{
			int valOfIndex;
			valOfIndex = listOfIntegers.get(currentIndex);							//take first value in array
			while (valOfIndex != currentIndex)										// swap values, till index and value in this index are the same
			{
				if (valOfIndex < 1) break;											// leave in place if negativ or 0
				if (valOfIndex >= listOfIntegers.size()) break;						// leave in place if value is bigger than size of array (no corespondig index) 
				if (valOfIndex == listOfIntegers.get(valOfIndex)) break;			// leave if dublicate of value
				
				listOfIntegers.set(currentIndex, listOfIntegers.get(valOfIndex));	//swap value with it corresponding index (exp. 2 in arr[2])
				listOfIntegers.set(valOfIndex, valOfIndex);							// and take value from swaped index and put it
				valOfIndex = listOfIntegers.get(currentIndex);						//in currently checked index
			}

		}
		
		for (int i = 1; i<listOfIntegers.size(); i++)
		{
			if(i != listOfIntegers.get(i) ) return i;							//if vaule and index don't match, it mean this is number we are looking for
		}
		// because indexing starts from 0 val=n can't be place in arr[n] and have to be placed in arr[0] index
		// so we check is it actually is there, if 'no' then 'n' is our anwser, otherwise anwser is 'n+1'  
		if (listOfIntegers.size() == listOfIntegers.get(0)) return listOfIntegers.size() + 1;
		else return listOfIntegers.size();
	}

}
