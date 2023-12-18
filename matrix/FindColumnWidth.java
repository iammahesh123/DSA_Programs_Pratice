package matrix;

public class FindColumnWidth {
    public int[] findColumnWidth(int[][] grid) {
        int[] result = new int[grid[0].length];
        for(int i = 0; i < grid[0].length; i++) {
            for(int j = 0; j < grid.length; j++) {
                 result[i] = Math.max(result[i],String.valueOf(grid[j][i]).length());
            }
        }
        return result;
    }

}
