package myAlgo;

public class rotateBits {
public static int Bit_in_integer = 32;
public static int rotate(int x,int n)
{
	return(x>>n|x>>(Bit_in_integer-n));
}
}
