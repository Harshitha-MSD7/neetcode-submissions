class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        HashSet<String> seen = new HashSet<>();
        List<List<Integer>> outer = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int target = nums[i] * (-1);
            for(int j = i+1; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    if(nums[j] + nums[k] == target) {
                        String key = nums[i]+","+nums[j]+","+nums[k];
                        if(!seen.contains(key)) {
                            seen.add(key);
                            List<Integer> inner = new ArrayList<>();
                            inner.add(nums[i]);
                            inner.add(nums[j]);
                            inner.add(nums[k]);
                            outer.add(inner);
                        }
                    }
                }
            }
        }
        return outer;
    }
}