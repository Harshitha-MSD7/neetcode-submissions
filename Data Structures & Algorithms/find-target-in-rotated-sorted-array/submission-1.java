class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            }
            // if target is not the nums[mid] 
            // check which half could target posibly be?
            // eliminate the other half

            // right half is sorted
            else if(nums[mid] <= nums[right]){
                // check if target exists in this range?
                if(nums[mid] <= target && target <= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }

            }
            //left half is sorted
            else {
                if(nums[left] <= target && target <= nums[mid]){
                    right = mid - 1;
                }

                else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
