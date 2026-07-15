class Solution {
    public int totalFruit(int[] fruits) {

        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<fruits.length; i++){
            int j = i;
            HashSet<Integer> set = new HashSet<>();
            while(set.size()<3){
                set.add(fruits[j]);
                max = Math.max(max, (j-i+1));
                if(j == fruits.length - 1)
                    break;
                j++;
            }

        }
        return max;

    }
}