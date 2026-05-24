class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.fill(res, 0);

        for(int i = 0; i<n;i++) {

            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]) {               
                int idx = stack.pop();
                res[idx] = i - idx;  // days waited
                

            }
        
            stack.push(i);

        }

        return res;
    }
}
