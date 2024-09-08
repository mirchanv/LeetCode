class MinStack {

    Stack<Integer> myStack;
    Stack<Integer> minStack;
    
    public MinStack() {
        myStack = new Stack<>();
        minStack = new Stack<>();    
    }
    
    public void push(int val) { 
        if (myStack.isEmpty()) {
            myStack.push(val);
            minStack.push(val);
        } else {
            myStack.push(val);
            int minVal = minStack.peek() < val ? minStack.peek() : val;
            minStack.push(minVal);
        }
    }
    
    public void pop() {
        myStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */