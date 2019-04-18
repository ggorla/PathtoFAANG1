package myAlgo;

public class _2matrixSearch {


	  private static boolean search(int[][] mat, int n, int x) { 
          
	        int i = 0, j = n-1; //set indexes for top right 
	                            // element 
	  
	        while ( i < n && j >= 0 ) 
	        { 
	            if ( mat[i][j] == x ) 
	            { 
	                System.out.print("n Found at "+ i + " " + j); 
	                return true; 
	            } 
	            if ( mat[i][j] > x ) 
	                j--; 
	            else // if mat[i][j] < x 
	                i++; 
	        } 
	          
	        System.out.print("n Element not found"); 
	        return false; // if ( i==n || j== -1 ) 
	          
	    } 
	public static void main(String[] args)
	{
		int[][] arr = new int[][] {{1, 2, 3},{4, 5, 6},{7, 8, 9},{10,12,14}};
		boolean result = search(arr, 3,4);
	
		 System.out.println(result);
		
	}
}
