package myAlgo;

public class MergeArrays {

	public static int[] mergeArrays(int[] a, int[] b ){
//	if(alength+blength>a.length) throw new IllegalArgumentException();
		
	int[] answer = new int[a.length+b.length];
	int i=0,j=0,k=0;
	while(i<a.length && j<b.length)
		answer[k++] = a[i]<b[j]?a[i++]:b[j++];
	while(i<a.length)
		answer[k++] = a[i++];
	while(j<b.length)
		answer[k++] = b[j++];
	return answer;
	}
	
	
	public static void main(String[] args)
	{
		int[] array1 = new int[] {1,3,5,7,20};
		int[] array2 = new int[] {2,4,6,8};
		int[] result =mergeArrays(array1,array2);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
