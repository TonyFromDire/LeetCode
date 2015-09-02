class MyQueue {
    	Stack<Integer> stack=new Stack<Integer>();
        public void push(int x) {
            stack.push(x);
        }

        // Removes the element from in front of queue.���ڶ���popɾ������������Ԫ�أ�ջ����ɾ��ջ��(����)��Ԫ��
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

        // Get the front element.���ڶ���pop������������Ԫ�أ�ջ���Ǹ���ջ��(����)��Ԫ��
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