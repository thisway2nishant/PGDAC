package queue;

public class Queue<T> {
	//data members
	int front, rear, size;
	T[] arr;
	
	//constructors
	public Queue() {
		super();
		size = 5;
		front = rear= -1;
		arr = (T[]) new Object[size];
	}
	
	public Queue(int size) {
		super();
		this.size = size;
		front = rear= -1;
		arr = (T[]) new Object[size];
	}
	
	//methods
	public boolean isFull() {
		return rear == arr.length-1;
	}
	
	public boolean isEmpty() {
		if(front == -1 || front > rear)
			return true;
		else
			return false;
	}
	
	public void enqueue(T obj ) {
		
	}
	
	
}
