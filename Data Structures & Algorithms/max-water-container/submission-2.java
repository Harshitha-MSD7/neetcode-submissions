class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int area = 0;
        while(left < right){
            area = Math.min(heights[left],heights[right]) * (right - left);
            max = Math.max(area, max);
            if(heights[left]<heights[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return max;
    }
}
