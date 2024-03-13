/**
 * AddTwoNumbers
 * https://leetcode.com/problems/middle-of-the-linked-list/solutions/4835201/easy-code-with-100-beats-with-c-beginner-friendly/?envType=daily-question&envId=2024-03-07
 */

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
      ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));


      ListNode l2 = middleNode(l1);
      while (l2 != null) {
            System.out.println(l2.val);
            l2 = l2.next;
        
      }
        
    }

    static ListNode middleNode(ListNode head) {
        ListNode anterior = head;
        int count = 0;
        int meio = 0;
        while (anterior != null) {
            count++;
            anterior = anterior.next;
        }
        meio = count / 2;
        anterior = head;
        for(int i = 0; i < meio; i++) {
            anterior = anterior.next;
        }

        return anterior;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
