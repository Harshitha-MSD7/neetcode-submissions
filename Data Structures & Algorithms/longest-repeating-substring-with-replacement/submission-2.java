class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            int[] freq = new int[26];
            int maxf = 0;
            int j = i;
            while(j < arr.length) {
                freq[arr[j] - 'A']++;
                maxf = Math.max(maxf, freq[arr[j] - 'A']);
                if((j - i + 1) - maxf > k) break;   // replacements needed > budget
                j++;
            }
            max = Math.max(max, j - i);
            if(j == arr.length) break;
        }
        return max;
    }
}