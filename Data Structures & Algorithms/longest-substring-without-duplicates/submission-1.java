class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> out = new HashSet<>();
        int j = 0;
        int max = 0;
        int p = 0;
        while(j<s.length()) {
            char i = s.charAt(p);
            char k = s.charAt(j);
            // if there is no similar char         
            if((out.contains(k))) {
                out.remove(i);
                p++;
            }
            // if there is no similar char
            else {
                out.add(k);
                j++;
                max = Math.max(max,out.size());
            }
        }
        return max;
    }
}
