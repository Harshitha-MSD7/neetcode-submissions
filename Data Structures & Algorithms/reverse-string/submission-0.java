class Solution {
    public void reverseString(char[] s) {

        // Two Pointers
        int n = s.length; // finding the length
        char[] reversed = new char[n]; // creating the array

        for(int i = 0; i<(n/2); i++) { // iterating through each char in s
            int j = n-(i+1); // A pointer from the back
            if(i<j) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            else break;
        }

    }
}