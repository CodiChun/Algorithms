package stack;

import java.util.Stack;
/*
 * Implement queue by stack;
 */
public class MyQueue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q = new MyQueue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		
		
		
		while(!q.empty()) {
			System.out.println("peak"+q.peek());
			System.out.println(q.pop());
		}
		
	}
	
	//1,2,3,4,5

	Stack<Integer> stack1;//bottom,4,3,2,1top front=1   
	Stack<Integer> stack2;//bottom,,top
	
	//constructor
	public MyQueue() {
		stack1 = new Stack();
		stack2 = new Stack();
	}


	
    public void push(int x) {

    	while(!stack1.isEmpty()) {
    		stack2.push(stack1.pop());
    	}
    	stack1.push(x);
    	while(!stack2.isEmpty()) {
    		stack1.push(stack2.pop());
    	}
        
    }
    
    public int pop() {
    	int num =  stack1.pop();
    	return num;
    }
    
    public int peek() {
    	int num = stack1.peek();
        return num;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
	

}
