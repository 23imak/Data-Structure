public class Queue {

	private int size;
	private int front = -1;
	private int rear = -1;
	public Integer[] queArr;

	public Queue(int size) {
		this.size = size;
		queArr = new Integer[size];

	}

	public Integer[] insert(int item) {
		if (rear == size - 1) {
		} else if (front == -1) {
			rear++;
			queArr[rear] = item;
			front = rear;
		} else {
			rear++;
			queArr[rear] = item;
		}
		return queArr;
	}

	public Integer[] delete() {
		if (front == -1) {
			System.out.println("Overflow");
		} else if (front == rear) {
			queArr[front] = (Integer) null;
			front--;
			rear--;
		} else {
			queArr[front] = (Integer) null;
			for (int i = front + 1; i <= rear; i++) {
				queArr[i - 1] = queArr[i];
			}
			rear--;
		}
		return queArr;
	}

	/*public void display() {

		for (int i = front; i <= rear; i++) {
			System.out.print(queArr[i] + "\t");
		}

	}*/
}
