class Solution {
    public int maxArea(int[] heights) {
        if (heights.length < 2) {
            return 0;
        }
        int maximum = 0;
        int gauche = 0;
        int droite = heights.length-1;

        while (gauche < droite) {
            int height = Math.min(heights[gauche], heights[droite]);
            int area = (droite - gauche) * height;
            if (maximum < area) {
                maximum = area;
            }
            if (heights[gauche] < heights[droite]) {
                gauche++;
            } else {
                droite--;
            }
        }
        return maximum;
    }
}
