package linkedlist;

public class SwapNodesinPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	//d-1-2-3-4
	//  h
	//    c
	
	//d-2-1-3-4
	//    p h
	
	//time :o(n)
	//space:o(1)
	
	

    public ListNode swapPairs(ListNode head) {
    	
    	ListNode dummy = new ListNode();
    	ListNode pre = new ListNode();
    	pre = dummy;
    	dummy.next = head;
    	
    	while(head!=null && head.next!=null) {
    		ListNode curr = head.next;
    		pre.next = curr;
    		head.next = curr.next;
    		curr.next = head;
    		pre = head;
    		head = head.next;
 
    	}
    	
    	return dummy.next;
    }


}
