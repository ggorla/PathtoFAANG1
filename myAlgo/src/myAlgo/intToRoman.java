package myAlgo;

public class intToRoman {
	
	static String[] romans = new String[] {"M","CM","D","CD","C","XC","L","XL","x","IX","V","IV","I"};

	static int[] numbers = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	public String intoRomans(int x) {
		if(x>3999 ||x<0) throw new IllegalStateException();
		int i=0;
		StringBuilder strb = new StringBuilder();
		while(x>0)
		{
			if(x-numbers[i]>0)
			{
			 x -=numbers[i];
			 strb.append(romans[i]);
			}
			else
				i++;
			
		}
		return strb.toString();
	}
}
