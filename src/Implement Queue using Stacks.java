class MyQueue {
    	Stack<Integer> stack=new Stack<Integer>();
        public void push(int x) {
            stack.push(x);
        }

        // Removes the element from in front of queue.对于队列pop删除出最早进入的元素，栈就是删除栈底(最早)的元素
        public void pop() {
        	Stack<Integer> tempStack=new Stack<Integer>();
        	while (stack.size()>0) {
				tempStack.add(stack.pop());
			}
        	tempStack.pop();
        	while (tempStack.size()>0) {
				stack.add(tempStack.pop());
			}
        }

        // Get the front element.对于队列pop给出最早进入的元素，栈就是给出栈底(最早)的元素
        public int peek() {
        	Stack<Integer> tempStack=new Stack<Integer>();
        	while (stack.size()>0) {
				tempStack.add(stack.pop());
			}
        	int result=tempStack.pop();
        	tempStack.push(result);
        	while (tempStack.size()>0) {
				stack.add(tempStack.pop());
			}
			return result;
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return stack.empty();
        }
}