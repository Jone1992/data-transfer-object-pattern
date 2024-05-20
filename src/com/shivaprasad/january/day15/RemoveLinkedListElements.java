package com.shivaprasad.january.day15;

//Note: For Linked List problems, Just focus on method code because creating Linked List for every problem is a hectic task,
//and we don't need to worry about it.
//Problem Link: https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode currNode = dummyNode;
        ListNode prevNode = dummyNode;

        while(currNode!=null)
        {
            if(currNode.val == val)
            {
                prevNode.next = currNode.next;
            }
            else{
                prevNode = currNode;
            }

            currNode = currNode.next;
        }

        return dummyNode.next;

    }
}
