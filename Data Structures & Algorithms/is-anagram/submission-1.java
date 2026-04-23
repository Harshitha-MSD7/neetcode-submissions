class Solution {
    public boolean isAnagram(String s, String t) {

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0; i<s.length(); i++) {
            int n = s.charAt(i)- 'a';
            freq1[n]++;

        }

        for(int j=0; j<t.length(); j++) {
            int m = t.charAt(j)- 'a';
            freq2[m]++;
        }

        if(Arrays.equals(freq1, freq2)) {
            return true;
        }

        return false;
    }
}
