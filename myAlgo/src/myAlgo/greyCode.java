package myAlgo;

import java.util.Scanner;

public class greyCode {

	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		boolean result = greyCode(Integer.parseInt(str1),Integer.parseInt(str2));
		System.out.println(result);

	}

	public static boolean greyCode(int a, int b) {
		int x = a^b;
		while(x>0)
		{
			if(x%2==1 && x>>1>0)return false;
			x= x>>1;
		}
		//return (x&(x-1))==0;
		return true;
	}
}
