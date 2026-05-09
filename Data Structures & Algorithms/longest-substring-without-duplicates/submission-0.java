class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> out = new HashSet<>();
        int max = 0;
        for(int j=0; j<s.length(); j++){
            char i = s.charAt(j);
            // if there is no similar char         
            if(!(out.contains(i))) 
                out.add(i);
            // if there is similar char
            else {
                max = Math.max(max,out.size());
                out.clear();
                out.add(i);
            }
        }

        return max;
    }
}
