class Solution {
    public int totalFruit(int[] fruits) {
        // length of the window (j-i+1)
        int max = Integer.MIN_VALUE;

        // How to code the constrain of only 2 diff int 
        // Non-bruteforce approach 
        
        for(int i = 0; i<fruits.length; i++){
            int j = i;
            HashSet<Integer> set = new HashSet<>();
            while(set.size()<3){
                set.add(fruits[j]);
                max = Math.max(max, (j-i+1));
                if(j == fruits.length - 1){
                    return max;
                }
                j++;
            }

        }
        return max;

    }
}