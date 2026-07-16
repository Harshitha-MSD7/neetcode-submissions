class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // we have to create a result array filled to 0
        // We have to find the next greater element using the monotonic 
        // decreasing stack

        int[] res = new int[temperatures.length];
        Arrays.fill(res,0);
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i<temperatures.length; i++){
                while((!stack.isEmpty()) && (temperatures[i] > temperatures[stack.peek()])){
                        int index = stack.pop();
                        res[index] = i-index;
                }
                stack.push(i);
        }

        return res;
    }
}
