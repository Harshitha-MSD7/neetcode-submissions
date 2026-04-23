class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int output = 1;
        int max = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] - nums[i-1] == 0){
                continue;
            }
             else if(nums[i] - nums[i-1] == 1){
                max++;
                if (max > output) {
                    output = max;
                }
            }
            else {
                max = 1;
            }
        }
        return output;
        
    }
}
