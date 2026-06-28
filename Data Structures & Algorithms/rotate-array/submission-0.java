class Solution {
    public void rotate(int[] nums, int k) {

        int len = nums.length;
        k = k % len;
        int[] res = new int[len];

        int n = len - k;
        for (int i = 0; n < len; i++) {      // last k elements → front  (your loop, unchanged)
            res[i] = nums[n];
            n++;
        }
        for (int j = 0; j < len - k; j++) {  // first len-k elements → back
            res[j + k] = nums[j];
        }
        for (int i = 0; i < len; i++) {      // copy back IN PLACE — the missing piece
            nums[i] = res[i];
        }
    }
}
    