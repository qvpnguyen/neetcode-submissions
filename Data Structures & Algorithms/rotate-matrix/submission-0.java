class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int k = 0; k < matrix.length; k++) {
            for (int left = 0, right = matrix.length-1; left < right; left++, right--) {
                int temp = matrix[k][left];
                matrix[k][left] = matrix[k][right];
                matrix[k][right] = temp;
            }
        }
    }
}
