class MinStack {

    private ArrayDeque<Integer> stack;
    private ArrayDeque<Integer> minstack;


    public MinStack() {
        // Initialized a stack object
        stack = new ArrayDeque<>();
        minstack = new ArrayDeque<>(); 
    }
    
    public void push(int val) {

        this.stack.push(val);

        if(this.minstack.isEmpty())
            this.minstack.push(val);
        else 
            this.minstack.push(Math.min(val, this.minstack.peek()));
        
    }
    
    public void pop() {

        this.stack.pop();
    }
    
    public int top() {

        return this.stack.pop();
        
    }
    
    public int getMin() {

        return this.minstack.pop();
        
    }
}
