package linkedlist;

public class RemoveNthNodeFromEndofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//n=1
	//d,1,null
	//i
	//  j
	//
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	
    	if(head.next == null) {
    		
    	}
    	
    	ListNode dummy = new ListNode();
    	dummy.next = head;
    	
    	ListNode i = dummy;
    	ListNode j = dummy;
    	
    	while(n>0) {
    		j=j.next;
    		n--;
    	}
    	
    	while(j.next!= null) {
    		i=i.next;
    		j=j.next;
    	}
    	
    	i.next = i.next.next;
    	
    	return dummy.next;
        
    }

}
