class Solution {
    public int maxArea(int[] heights) {
        // This is just finding the area of a rectangle 
        // k = j-i will be the length and 
        // l = min(heights[i], heights[j] is the bredth)
        // the largest k*l will be the int to return
        // O(n^2) - time complexity

        int cur_max_Water = 0;

        for(int i=0; i<heights.length; i++) {
            for(int j=i+1; j<heights.length; j++){
                int bredth = j-i;
                int length = Math.min(heights[i], heights[j]);
                int area = length*bredth;
                int water = Math.max(cur_max_Water,area);
                cur_max_Water = water;
            }
        }
        return cur_max_Water;
    }
}
