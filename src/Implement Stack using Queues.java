class MyStack {
    // Push element x onto stack.
        List queue = new ArrayList();
        public void push(int x) {
        	queue.add(x);
        }

        // Removes the element on top of the stack.ջ��top����������ջ�������ڶ����������ڶ�β��������ɾ����βԪ��
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

        // Get the top element.ջ��top����������ջ�������ڶ����������ڶ�β�������Ǹ�����βԪ��
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