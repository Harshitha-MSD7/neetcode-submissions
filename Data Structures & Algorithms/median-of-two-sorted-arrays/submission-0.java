class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int sum = m+n;
        int[] full = new int[sum];

        for(int i=0; i<sum; i++) {
            if(i<n){
                full[i] = nums1[i];
            }
            else
                full[i] = nums2[i-n];
        } 
        Arrays.sort(full);

        if(sum%2 == 0) {
            return (full[(sum/2)-1] + full[(sum/2)]) / 2.0;           
        }
        else {
            return full[(int)(sum/2)];
        }
        
    }
}
