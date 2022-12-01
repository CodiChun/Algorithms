package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//d<1 2>3>4>5>n
	//p c n
	//  p c n
	//
	//time: o(n)
	//space: o(1)
	
	
    public ListNode reverseList(ListNode head) {

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
