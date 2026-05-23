class Solution {
    public int evalRPN(String[] tokens) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("/")||tokens[i].equals("*")) {

                int ans = 0;
                int num1 = stack.pop();
                int num2 = stack.pop();

                if(tokens[i].equals("+")) {
                    ans = num2 + num1;
                    stack.push(ans);

                }
                else if(tokens[i].equals("-")) {
                    ans = num2 - num1;
                    stack.push(ans);
                    
                }
                else if(tokens[i].equals("*")) {
                    ans = num2 * num1;
                    stack.push(ans);
                    
                }
                else {
                    ans = num2 / num1;
                    stack.push(ans);

                }
            }

            else 
                stack.push(Integer.parseInt(tokens[i]));
        } 
        
        return stack.pop();
    }
}
