package myAlgo;

public class _3mergeArrays {

	public static void  mergeArrays(int[]a , int[]b, int alen, int blen) throws Exception {
		if(alen+blen<a.length) 
			throw new Exception();
		int aIndex = alen-1;
		int bIndex = blen-1;
		int mergeIndex = alen+blen -1;
		while(aIndex>=0&& bIndex>=0)
		{
			if(a[aIndex]>b[bIndex]) {
				a[mergeIndex] = a[aIndex];
				aIndex--;
			}
			else {
				a[mergeIndex] = b[bIndex];
				bIndex--;
			}
			mergeIndex--;
		}
		while(bIndex>=0) {
			a[mergeIndex] = b[bIndex];
			bIndex--;
			mergeIndex--;
		}
	}
	public static void main(String[] args) throws Exception
	{
		int[] a = new int[] {1,2,3,4};
		int[] b = new int[] {6,7,8};
		mergeArrays(a,b,4,3);
	}
}
