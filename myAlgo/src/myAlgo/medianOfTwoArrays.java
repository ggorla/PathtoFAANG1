package myAlgo;

import java.util.Arrays;

public class medianOfTwoArrays {

	public double findMedian(int[] num1, int[] num2)
	{
		int[] finalArray = new int[num1.length+num2.length];
		System.arraycopy(num1, 0, finalArray, 0, num1.length);
		System.arraycopy(num2, 0, finalArray, num1.length, num2.length);
		Arrays.sort(finalArray);
		int sortedFinalLen = finalArray.length;
		if(sortedFinalLen==1)
		{
			return finalArray[0];
		}
		if(sortedFinalLen%2==0)
		{
			sortedFinalLen =(int) Math.floor((sortedFinalLen-1)/2);
			return (double)(finalArray[sortedFinalLen]+finalArray[sortedFinalLen+2])/2;
		}
		else
		{
			sortedFinalLen = (int)Math.ceil(sortedFinalLen)/2;
			return (double)(finalArray[sortedFinalLen]);
		}
	}
}
