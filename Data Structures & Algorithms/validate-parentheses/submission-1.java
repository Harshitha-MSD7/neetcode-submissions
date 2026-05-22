class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        //Declare a stack
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++ ) {
            // Putting the first half into stack
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
                stack.push(arr[i]);
            else {
                if(stack.isEmpty())
                    return false;
                else if (arr[i] == ')') {
                    if(stack.peek() == '(')
                        stack.pop();
                    else 
                        return false;
                }
                else if (arr[i] == ']') {
                    if(stack.peek() == '[')
                        stack.pop();
                    else 
                        return false;
                }
                else if (arr[i] == '}') {
                    if(stack.peek() == '{')
                        stack.pop();
                    else 
                        return false;
                }
            }
        }

        if(stack.isEmpty())
            return true;
        return false;
    }
}
