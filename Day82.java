class MyStack {
    private Queue<Integer> Que1;
    private Queue<Integer> Que2;

    public MyStack() {
        Que1 = new LinkedList<>();
        Que2 = new LinkedList<>();
    }
    
    public void push(int x) {
        // Add the new element to Que2
        Que2.add(x);
        // Move all elements from Que1 to Que2
        while (!Que1.isEmpty()) {
            Que2.add(Que1.remove());
        }
        // Swap the names of the two queues
        Queue<Integer> temp = Que1;
        Que1 = Que2;
        Que2 = temp;
    }
    public int pop() {
        // Remove the front element from Que1
        return Que1.remove();
    }
    
    public int top() {
        // Peek at the front element of Que1
        return Que1.peek();
    }
    
    public boolean empty() {
        // Check if Que1 is empty
        return Que1.isEmpty();
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
