package java;
/*
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    

    public static void main(String[] args) {
        // ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();

        ListNode result = mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
        
    }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        List<Integer> numero = new ArrayList<>();

        if(list1 == null && list2== null){
            return null;
        }
        while (list1 != null) {
            numero.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            numero.add(list2.val);
            list2 = list2.next;
        }

        numero = numero.stream().sorted().toList();
        ListNode anterior = null;
        for(int i = numero.size()-1; i >= 0; i --){

            anterior = new ListNode(numero.get(i), anterior);
            list3 = anterior;
            
            
            

        }
        return list3;  
    }

   static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
       
    
}
