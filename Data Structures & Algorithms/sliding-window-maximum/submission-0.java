class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int r = k-1;
       int l = 0;
       int[] arr = new int [(nums.length - k+1)];
       while(r < nums.length) {
            int max = 0;
            for(int i = l; i< r+1; i++) {
                max = Math.max(max, nums[i]); 
            }
            arr[l] = max;
            r++;
            l++;
       }

       return arr;

    }
}
