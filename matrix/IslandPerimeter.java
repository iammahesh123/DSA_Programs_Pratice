package matrix;

import java.util.Scanner;

/**You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 
represents water.Grid cells are connected horizontally/vertically (not diagonally). 
The grid is completely surrounded by water, and there is exactly one island (i.e., 
one or more connected land cells).The island doesn't have "lakes", meaning the water inside isn't connected 
to the water around the island. One cell is a square with side length 1. 
The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.**/

public class IslandPerimeter {
	static int printIslandPerimeter(int[][] grid) {
	      int output = 0;
	      for (int i = 0; i < grid.length; i++) {
	    	  for (int j = 0; j < grid[i].length; j++) {
	    		  if (grid[i][j] == 1){
	    			  output += 4;
	    			  if ( j-1 >= 0  && grid[i][j-1] == 1)  output -= 1;
	    			  if ( j+1 != grid[i].length && grid[i][j+1] == 1)  output -=1;
	    			  if (i-1 >= 0 && grid[i-1][j] == 1)   output -= 1;
	                  if (i+1 != grid.length && grid[i+1][j] == 1) output -=1;
	                }
	            }
	        }
	        return output;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row length: ");
		int r = sc.nextInt();
		System.out.print("Enter the column length: ");
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original matrix: ");
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Island Perimeter: "+printIslandPerimeter(matrix));
	}	
}
