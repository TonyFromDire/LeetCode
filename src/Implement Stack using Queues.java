class MyStack {
    // Push element x onto stack.
        List queue = new ArrayList();
        public void push(int x) {
        	queue.add(x);
        }

        // Removes the element on top of the stack.栈的top就是最后进的栈顶，对于队列最后进的在队尾，所以是删除队尾元素
        public void pop() {
        	List tempList = new ArrayList();
        	while (queue.size()>1) {
				tempList.add(queue.remove(0));
			}
        	while (tempList.size()>0) {
				queue.add(tempList.remove(0));
			}
        	queue.remove(0);
        }

        // Get the top element.栈的top就是最后进的栈顶，对于队列最后进的在队尾，所以是给出队尾元素
        public int top() {
        	List tempList = new ArrayList();
        	while (queue.size()>1) {
				tempList.add(queue.remove(0));
			}
        	int result=(Integer) queue.remove(0);
        	tempList.add(result);
        	while (tempList.size()>0) {
				queue.add(tempList.remove(0));
			}
        	return result;
        }

        // Return whether the stack is empty.
        public boolean empty() {
        	return queue.isEmpty();
            
        }
}