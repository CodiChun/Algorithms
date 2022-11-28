package linkedlist;

import java.util.List;

/**
 * 
 * 1,2,4
 *     h
 * 1,3,4
 *     h
 * 
 * h,1,1,2,3,4
 *           c
 */
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		//head-curr-list1
		
		ListNode head = new ListNode();
		ListNode curr = head;
		
		while(list1!=null && list2!=null) {
			if(list1.val<list2.val) {
				curr.next = list1;
				curr = curr.next;
				list1 = list1.next;
			} else {
				curr.next = list2;
				curr = curr.next;
				list2 = list2.next;
			}
		}
		
		if(list1!=null) {
			curr.next = list1;
		}
		
		if(list2!=null) {
			curr.next = list2;
		}
		
		return head.next;
	}
	

	

}
