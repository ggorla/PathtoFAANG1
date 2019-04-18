package myAlgo;
import java.util.*;
public class zeroMatrix{

	public static void zeroMatrix(boolean[][] matrix){
	if(matrix.length==0 ||matrix[0].length==0) return;
	boolean rowFirst= false, colFirst = false;
	for(boolean i:matrix[0])
		rowFirst |=i;
	for(boolean[] j: matrix) {
		colFirst |=j[0];
	}
	for(int i =0;i<matrix.length;i++)
	{
		for(int j=0; j<matrix[0].length;j++)
		{
			if(matrix[i][j])
			{
			matrix[i][0] = true;
			matrix[0][j] = true;
		}
		}
	}
	for(int i =0; i<matrix.length; i++)
	{
		if (matrix[i][0])
		{
			for(int j = 0; j<matrix[j].length;j++)
			{
				matrix[i][j] = true;
			}
		}
	}
	for (int j = 0; j<matrix[0].length;j++)
	{
		if(matrix[0][j])
		{
			for(int i=0; i<matrix.length;i++)
			{
				matrix[i][j] = true;
			}
		}
	}
	if(rowFirst)
	{
		for(int i=0; i<matrix[0].length;i++)
		{
			matrix[0][i]= true;
		}
	}
	if(colFirst)
		for(int i = 0; i<matrix.length;i++)
		{
			matrix[i][0] = true;
		}
		
	}
	public static void main(String[] args) {
		boolean[][] a = new boolean[][] {
			{true,false,false},
			{false, false, false},
			{false, false, false}};
			zeroMatrix(a);	
			
		
	}
}