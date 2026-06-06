class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int max = 0;
        for(int i = 0; i<arr.length; i++) {
            int j = i + 1;
            int count = k;
            while(count > 0 && j < arr.length) {
                if(arr[i] != arr[j]) 
                    count--; 
                j++;
            }
            max = Math.max(max, j-i+1);
        }
        return max;
    }
}
