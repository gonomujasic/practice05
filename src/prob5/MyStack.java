package prob5;

public class MyStack {
	private String[] buffer;
	private int top;
	
	public MyStack(int length) {
		
		buffer = new String[length];
		
	}
	
	
	public void push(String str) {
		
		if(top == buffer.length) {
			
			String[] extBuffer = new String[buffer.length+20];
			
			for(int i = 0; i< buffer.length; i++) {
				extBuffer[i] = buffer[i];
			}
			buffer = extBuffer;
		}
		
		buffer[top] = str;
		top++;
	}
	
	public String pop() throws MyStackException {
		
		if(top == 0)
			throw new MyStackException();
		
		String str = buffer[top-1];
		buffer[top-1] = null;
		top--;
		
		return str;
	}
	
	public boolean isEmpty() {
		boolean isEmpty = false;
		
		if(top == 0)
			isEmpty = true;
		
		return isEmpty;
	}

}