class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        //Declare a stack
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++ ) {
            // Putting the first half into stack
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
                stack.push(arr[i]);
            else if ((arr[i] == ')' || arr[i] == '}' || arr[i] == ']'))
                stack.pop();
        }

        if(stack.isEmpty())
            return true;
        return false;
    }
}
