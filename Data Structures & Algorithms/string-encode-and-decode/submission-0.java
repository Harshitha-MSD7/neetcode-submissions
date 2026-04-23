class Solution { 
        // My approach
        // encode → length + # + string
        // decode → read length, find #, grab that many chars
    public String encode(List<String> strs) {
        int n = strs.size();
        StringBuilder encoded = new StringBuilder();
        for(int i = 0; i<n; i++) { // iterating
            int len = strs.get(i).length(); // lenth of each string
            encoded.append(len); // adding the length to the encoded
            encoded.append("#"); // adding the delimeter to the encoded
            encoded.append(strs.get(i)); // adding the string to the encoded
        } // our encoded has all the length + # + string stored in it

        return encoded.toString(); // Our encoded string gets returned
    }

    public List<String> decode(String str) {

        // declare a list of strings called decode
        List<String> decode = new ArrayList<>();
        // the length of each string can be found from the first number 
        // number of strings has to somehow found by the number of  length + # 
        // So you might have to iterate through each char
        int i = 0;
         while(i < str.length()) {
        // step 1 → find # position
        int j = str.indexOf('#', i);
        
        // step 2 → get length (everything between i and j)
        int len = Integer.parseInt(str.substring(i, j));
        
        // step 3 → get string (len chars after the #)
        String word = str.substring(j+1, j+1+len);
        decode.add(word);
        
        // step 4 → move pointer past this word
        i = j + 1 + len;
    }
        return decode;
    }
}
