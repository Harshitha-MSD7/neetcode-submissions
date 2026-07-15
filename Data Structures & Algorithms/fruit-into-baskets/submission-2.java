class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        for(int i = 0; i < fruits.length; i++){
            HashSet<Integer> set = new HashSet<>();
            int j = i;
            while(j < fruits.length){
                set.add(fruits[j]);
                if(set.size() > 2) break;   // stop BEFORE counting the illegal window
                max = Math.max(max, j - i + 1);
                j++;
            }
        }
        return max;
    }
}