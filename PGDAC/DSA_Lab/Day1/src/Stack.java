
public class Stack<T> {
	//data members
	private int top,size;
	private T[] arr;
	
	//constructor
	public Stack (int size) {
		super();
		this.size = size;
		top = -1;
		arr = (T[]) new Object[size];
	}
	
	public Stack() {
		super();
		size = 5;
		top = -1;
		arr = (T[]) new Object[size];
	}
	
	//methods
	public boolean isFull() {
		return top == (size-1);
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(T obj) throws Exception {
		if(isFull())
			throw new Exception("Stack is Full.");
		else {
			top=top+1;
			arr[top] = obj;
		}
	}
	
	public T pop() throws Exception {
		if(isEmpty())
			throw new Exception("Stack is empty");
		else {
			return arr[top--];
		}
	}
	
}
