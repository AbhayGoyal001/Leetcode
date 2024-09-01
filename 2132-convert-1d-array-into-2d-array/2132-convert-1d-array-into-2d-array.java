class Solution {
    public int[][] construct2DArray(int[] arr1D, int rows, int cols) {
        
        if (rows * cols != arr1D.length) {
            return new int[0][0];  // Return an empty array if the dimensions don't match
        }

        // Initialize the 2D array and fill it in one pass
        int[][] arr2D = new int[rows][cols];
        for (int i = 0; i < rows * cols; i++) {
            arr2D[i / cols][i % cols] = arr1D[i];
        }

        return arr2D;
    }
}