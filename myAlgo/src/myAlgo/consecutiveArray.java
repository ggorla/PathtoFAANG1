package myAlgo;

import java.util.HashSet;

public class consecutiveArray
{
	public static int consecutive(int[] a) {
	HashSet<Integer> values = new HashSet();
	for(int i:a)
	{
		values.add(i);
	}
	int max = 0;
	for(int i:values)
	{
		if(values.contains(i-1))
			continue;
		int length =0;
		while(values.contains(i++))
			length++;
		max = Math.max(max, length);
	}
	return max;
	}
	
	
public static void main(String[] args)
{
	int[] array = new int[] {4,2,1,6,5,8,9,10,11,12,13,20,21,22,23,24,25,26,27,28};
	int result = consecutive(array);
	System.out.println(result);
}
}