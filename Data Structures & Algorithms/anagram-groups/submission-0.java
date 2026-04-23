class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String s : strs ){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            // now what do you do with key and s?
            
            if(map.containsKey(key))
                map.get(key).add(s);

            else {
                ArrayList<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(key, newList);
            }
        }
        
        return new ArrayList<>(map.values());
    }
}