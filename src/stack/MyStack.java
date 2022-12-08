package stack;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Implement stack by queue
 */
public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack s = new MyStack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.empty()) {
			System.out.println(s.top());
			System.out.println(s.pop());
		}

	}
	
	//back,4,3,2,1,frond
	//back,5,1,2,3,4,frond size 4, add 5
	//
	
	
	Queue<Integer> q;
	
	
    public MyStack() {
    	 q = new LinkedList<>();
    }
    
    public void push(int x) {
    	int size = q.size();
    	q.add(x);
    	while(size>0) {
    		q.add(q.poll());
    		size --;
    	}
        
    }
    
    public int pop() {
       return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }

}
