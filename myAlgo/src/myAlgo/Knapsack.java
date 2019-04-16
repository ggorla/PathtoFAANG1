package myAlgo;

public class Knapsack {
	public static class item{
		int weight;
		int value;
		public item(int weight, int value) {
			this.value = value;
			this.weight= weight;
		}
	}
public static int knapsack(item[] items, int w) {
	int[][]cache = new int[items.length+1][w+1];
	for(int i = 1;i<=items.length;i++)
	{
		for(int j = 0;j<=w;j++)
		{
			if(items[i-1].weight>j) cache[i][j] = cache[i-1][j];
			else 
				cache[i][j] = Math.max(cache[i-1][j], cache[i-1][j-items[i-1].weight]+items[i-1].value);
		}
	}
	return cache[items.length][w];
}
}
