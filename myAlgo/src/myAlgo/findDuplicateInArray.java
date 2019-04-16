package myAlgo;

import java.util.*;

public class findDuplicateInArray {

	public static List<Integer> findDuplicate(int[] arr){
		Set<Integer> resultset = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			int index = Math.abs(arr[i])-1;
			if(arr[index]<0) {
				resultset.add(Math.abs(arr[i]));
			}else {
				arr[index] = -arr[index];
			}
		}
		for(int i = 0; i<arr.length;i++) {
			arr[i] = Math.abs(arr[i]);
		}
		return new ArrayList(resultset);
	}
}
