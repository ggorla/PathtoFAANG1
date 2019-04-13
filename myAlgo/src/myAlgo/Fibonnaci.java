package myAlgo;

import java.util.Scanner;

public class Fibonnaci {

	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		long result = fib(Integer.parseInt(str));
		
		System.out.println(Long.toString(result));
		
		}
	public static long fib(int x)
	{
		if(x<0) return -1;
		if(x==0) return 0;
		long[] cache = new long[x+1];
		for(int i = 1; i<cache.length;i++)
		{
			cache[i]=-1;
		}
		cache[1] = 1;
		return fib(x, cache);
	}
	private static long fib(int x, long[] cache) {
		if(cache[x]>-1)
			return cache[x];
		cache[x] = fib(x-1, cache)+fib(x-2,cache);
		return cache[x];
		
	}
	
}
