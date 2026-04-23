class Solution {
    public void reverseString(char[] s) {

        // Two Pointers
        int n = s.length; // finding the length
        char[] reversed = new char[n]; // creating the array

        for(int i = 0; i<(n/2); i++) { // iterating through each char in s
            int j = n-(i+1); // A pointer from the back
            
                char temp = s[i]; // temp will store the jth char
                s[i] = s[j]; // ith chat will now have jth char
                s[j] = temp; // ith chat will now have jth char
            
            
        }

    }
}