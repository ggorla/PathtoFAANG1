package myAlgo;

import java.util.Scanner;

public class SwapNoTemp {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		
		swapWithNoTemp(Integer.parseInt(str1),Integer.parseInt(str2));
		
	}
	public static void swapWithNoTemp(int a, int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a+" "+b);
	}
}
