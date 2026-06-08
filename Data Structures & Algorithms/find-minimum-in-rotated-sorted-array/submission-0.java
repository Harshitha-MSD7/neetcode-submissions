class Solution {
    public int findMin(int[] nums) {
     int left = 0;
     int right = nums.length - 1;
     while(left<right){
        int mid = left +  (right - left) / 2;
        // mid is still before the drop
        if(nums[mid] > nums[right])
            left = mid + 1;
        // mid has encountered the dip
        // so now out smallest element is either in the left or at mid
        else 
            right = mid;
     }   
     return nums[left];
    }
}
