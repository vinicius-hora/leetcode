package javaleetcode;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * 
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,1,2]
Output: [1,2]
Example 2:


Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(3)))));
        RemoveDuplicatesFromSortedList rSortedList =  new RemoveDuplicatesFromSortedList();

        ListNode listNode = rSortedList.deleteDuplicates(l1);

    while (listNode != null) {
        System.out.println("valor: " + listNode.val);
        listNode = listNode.next;
        
    }
    
    }

    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null) return head;
        ListNode atual = head;
        while(atual.next!= null){

            
            if(atual.val == atual.next.val){

                atual.next = atual.next.next;
            }
            else{
                atual = atual.next;
            }         


        }

        return head;
        
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
}
