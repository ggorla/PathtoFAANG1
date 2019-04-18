package myAlgo;

import java.util.PriorityQueue;

public class _1mergeKSrotedArray {

	private static class  QueueNode implements Comparable<QueueNode>{
		int array, index,value;
		
		public QueueNode(int array, int index, int value) {
			this.array = array;
			this.index = index;
			this.value = value;
		}
		public int compareTo(QueueNode n) {
			if(value>n.value) return 1;
			if(value<n.value) return -1;
			return 0;
		}
		
	}
	public static int[] merge(int[][] array)
	{
	int size = 0;
	PriorityQueue<QueueNode> pq = new PriorityQueue<_1mergeKSrotedArray.QueueNode>();
	for(int i =0; i<array.length;i++)
	{
		size += array[i].length;
		if(array[i].length>0)
			pq.add(new QueueNode(i,0,array[i][0]));
		
	}
	int[] resutl = new int[size];
	for(int i = 0; !pq.isEmpty();i++)
	{
		QueueNode n = pq.poll();
		resutl[i] = n.value;
		int newIndex = n.index+1;
		if(newIndex<array[n.array].length) {
			pq.add(new QueueNode(n.array, newIndex, array[n.array][newIndex]));
			}
		
	}
	return resutl;
	}
	
	public static void main(String[] args)
	{
		int[][] arr = new int[][] {{1, 4, 7},{2, 5, 8},{3, 6, 9},{10,12}};
		int[] result = merge(arr);
		for(int i=0; i<result.length;i++)
		 System.out.println(result[i]);
		
	}
	
}
