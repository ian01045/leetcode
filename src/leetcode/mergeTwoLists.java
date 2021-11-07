package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.lang.Object;

public class mergeTwoLists {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String [] test_array = new String [] {"abc","abc","abc"};
//		l1 = [1,2,4], l2 = [1,3,4]
		ListNode l1_1= new ListNode(1);
		ListNode l1_2= new ListNode(2);
		ListNode l1_3= new ListNode(4);
		l1_1.next=l1_2;
		l1_2.next=l1_3;
		
		ListNode l2_1= new ListNode(0);
		ListNode l2_2= new ListNode(3);
		ListNode l2_3= new ListNode(4);
		l2_1.next=l2_2;
		l2_2.next=l2_3;
		
		
		ListNode result = mergeTwoLists(l1_1, l2_1);

		System.out.println(result.val);
		System.out.println(result.next.val);
		System.out.println(result.next.next.val);
		System.out.println(result.next.next.next.val);
		System.out.println(result.next.next.next.next.val);
		System.out.println(result.next.next.next.next.next.val);

	}
	
//	public static ListNode mergeTwoLists(ListNode headA, ListNode headB) {
//		if (headA == null && headB == null)
//			return null;
//		List<Integer> list = new ArrayList<>();
//		while (headA != null) {
//			list.add(headA.val);
//			headA = headA.next;
//		}
//		while (headB != null) {
//			list.add(headB.val);
//			headB = headB.next;
//		}
//		Collections.sort(list);
//		ListNode node = new ListNode(list.get(0));
//		ListNode temp = node;
//		for (int i = 1; i < list.size(); i++) {
//			temp.next = new ListNode(list.get(i));
//			temp = temp.next;
//		}
//		return node;
//	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		List<Integer> list = new ArrayList<>();

		while (l1 != null) {
			list.add(l1.val);
			l1 = l1.next;
		}

		while (l2 != null) {
			list.add(l2.val);
			l2 = l2.next;
		}

		list.sort(null);

		ListNode result = new ListNode(list.get(0));
		ListNode tmp = result;

		for (int i = 1; i < list.size(); i++) {
			tmp.next = new ListNode(list.get(i));
			tmp = tmp.next;
		}

		return result;
	}

}
