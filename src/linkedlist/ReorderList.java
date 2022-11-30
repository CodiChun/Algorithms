package linkedlist;

public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//1>2>3>4>5
	//    m
	//1>5>2>4>3
	//1>5>2>4>3
	
	//1>2>3>4
	//  m
	//1>4>2>3
	//4>3
	
	//1. find middle one
	//2. reverse the right part
	//3. intsert each one from right part to left part
	
	//time:o(n)
	//space: o(1)
	
	
	//1>2>3 4>5
	//s
	//f
	
	
    public void reorderList(ListNode head) {
    	//1. find middle one
    	
    	ListNode dummy = new ListNode();
    	dummy.next = head;
    	
    	
    	ListNode fast = head;
    	ListNode slow = head;
    	while(fast!=null && fast.next!=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	//slow is mid
    	
    	//2. reverse the right part
    	ListNode secondHead = slow.next;
    	slow.next = null;
    	secondHead = reverse(secondHead);
  
    	//3. intsert each one from right part to left part
    	//1>2>3
    	//h
    	//4>5
    	//s
    	
    	//1>4>5 2>3
    	//h s   t
    	//1>4>2>3 5
    	//h s     t1
    	//1>4>2>3 5
    	//    h   t2
    	
    	while(head!=null && secondHead !=null) {
    		ListNode temp1 = head.next;
    		head.next = secondHead;
    		ListNode temp2 = secondHead.next;
    		secondHead.next = temp1;
    		head = head.next.next;
    		secondHead = temp2;
    	}
    	
    	
    }
    
    //null<1 2>3>4>5>null
    //   p c n
    //     p c n
    public ListNode reverse(ListNode head) {
    	ListNode pre = null;
    	ListNode curr = head;
    	while(curr!=null) {
    		ListNode next = curr.next;
    		curr.next = pre;
    		pre = curr;
    		curr = next;
    	}
    	return pre;
    }

}
