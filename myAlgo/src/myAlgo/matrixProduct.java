package myAlgo;

public class matrixProduct {

	public static int matrixProduct(int[][] matrix) {
		if(matrix.length==0||matrix[0].length==0) return 0;
		int[][]maxCache = new int[matrix.length][matrix[0].length];
		int[][]minCache = new int[matrix.length][matrix[0].length];
		for(int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[0].length;j++)
			{
				int maxVal = Integer.MIN_VALUE;
				int minVal = Integer.MAX_VALUE;
				if(i==0&& j==0)
				{
					minVal = matrix[i][j];
					maxVal = matrix[i][j];
				}
				if(i>0)
				{
					int tempmax = Math.max(matrix[i][j]* maxCache[i-1][j], matrix[i][j]*minCache[i-1][j]);
					maxVal = Math.max(tempmax, maxVal);
					int tempmin = Math.min(matrix[i][j]*maxCache[i-1][j], matrix[i][j]* minCache[i-1][j]);
					minVal = Math.min(tempmin, minVal);					
				}
				if(j>0) {
					int tempMax = Math.max(matrix[i][j]*maxCache[i][j-1], matrix[i][j]*minCache[i][j-1]);
					maxVal = Math.max(tempMax, maxVal);
					int tempmin = Math.max(matrix[i][j]*maxCache[i][j-1], matrix[i][j]*minCache[i][j-1]);
					minVal = Math.min(tempmin, minVal);
				}
				maxCache[i][j] = maxVal;
				minCache[i][j] = minVal;
						}
		}
		return maxCache[maxCache.length-1][maxCache[0].length-1];
	}
	
}
