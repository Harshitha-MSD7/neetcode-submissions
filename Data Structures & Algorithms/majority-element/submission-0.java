class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            if(map.containsKey(i)) {
                map.put(i,(map.get(i)+1));
            }
            else 
                map.put(i, 1);
        }
        int res = 0;
        int max = 0;
        for(Map.Entry<Integer, Integer> j : map.entrySet()){
            max = Math.max(max, j.getValue());
            res = j.getKey();
        }

        return res;
    }
}