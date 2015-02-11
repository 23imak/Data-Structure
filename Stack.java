
public class Stack {

	private int size;
	private long[] stArray;
	private int top;

	public Stack(int s){
		size = s;
		stArray = new long[size];
		top = -1;
	}
	
	public long[] push(long j){
		stArray[++top] = j;
		return stArray;
	}
	
	public long pop(){
		return stArray[top--];
	}
	
	public boolean Empty(){
		return (top == -1);
	}
	
	public boolean Full(){
		return (top == size-1);
		
	}
}
