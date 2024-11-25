package java;
import java.util.ArrayList;
import java.util.List;

/**
 * AddTwoNumbers
 * https://leetcode.com/problems/add-two-numbers/description/
 * 
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(7)));
        ListNode result = new ListNode(2);
        int soma = 10 + 5;
        int carry = soma % 10;
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }

        System.out.println("carry: " + carry);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode maior = new ListNode();
        ListNode menor = new ListNode();
        ListNode retornoList = new ListNode();
        int resultado = 0;
        int resultadoVai1 = 0;
        int carry = 0;

        if(tamanho(l1) < tamanho(l2)){
            maior = l2;
            menor = l1;
        }
        if(tamanho(l1) >= tamanho(l2)){
            maior = l1;
            menor = l2;
        }

        while (maior != null) {
            if(menor != null){
                resultado = maior.val + menor.val;
                carry = carryVerify(resultado);
                resultadoVai1 = resultadoSoma(resultado);
                retornoList = new ListNode(resultadoVai1, retornoList);
                menor = menor.next;

            }
            if(carry > 0){
                resultado = maior.val + carry;
                carry = carryVerify(resultado);
                resultadoVai1 = resultadoSoma(resultado);
            }
            resultado = maior.val + menor.val;
            carry = carryVerify(resultado);
            resultadoVai1 = resultadoSoma(resultado);
            

            
        }
        
        


        return null;
        
    }

    int carryVerify (int soma){

        return soma / 10;

    }
    int resultadoSoma(int resultado){
        int resultadoPorcentagem = resultado % 10;

        return resultadoPorcentagem;
    }
    int tamanho(ListNode node){
        int contador = 0;
        while (node != null) {
            contador ++;
            node = node.next;
        }

        return contador;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


        

    
}

