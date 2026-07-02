class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; 
        int[] res = new int[nums.length];
        int j = 0;

        for(int i = nums.length - k; i < nums.length ; i++){
            res[j] = nums[i];
            j++;
        }

        for(int m = 0; m < nums.length - k; m++){
            res[j] = nums[m];
            j++;
        }

        for(int p = 0; p < nums.length; p++){
            nums[p] = res[p];
        }
        
    }
}