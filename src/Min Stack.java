class MinStack {
	private Stack<Integer>  stack = new Stack<>();
	private Stack<Integer> minStack = new Stack<Integer>();

	public void push(int x) {
		if (minStack.empty() || minStack.peek() >= x) {
			minStack.add(x);
		}
		stack.add(x);
	}

	public void pop() {
		int ele = stack.pop();
		if (ele == minStack.peek()) {
			minStack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
