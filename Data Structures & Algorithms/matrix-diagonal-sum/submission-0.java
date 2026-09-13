class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int gauche = 0, droite = mat.length-1; gauche < mat.length; gauche++, droite--) {
            sum += mat[gauche][gauche];
            sum += mat[droite][gauche];
        }
        if (mat.length % 2 == 1) {
            int mid = mat.length / 2;
            sum -= mat[mid][mid];
        }
        return sum;
    }
}