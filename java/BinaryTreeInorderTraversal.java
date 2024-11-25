package java;
/*
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 * 
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:

Input: root = [1,null,2,3]

Output: [1,3,2]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,2,6,5,7,1,3,9,8]

Explanation:



Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]

 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 

Follow up: Recursive solution is trivial, could you do it iteratively?
 */

import java.util.List;
import java.util.*;

public class BinaryTreeInorderTraversal {
    
    public static void main(String[] args) {
        TreeNode valor = new TreeNode(1);
        valor.right = new TreeNode(2); 
        valor.right.left = new TreeNode(3);
        
        BinaryTreeInorderTraversal binary = new BinaryTreeInorderTraversal();

        List<Integer> teste = binary.inorderTraversal(valor);

        for(Integer t: teste){
            System.out.println(t);
        }
    
        
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lista = new ArrayList<>();
        percorrerArvore(root, lista);
        

        return lista;
        
    }

    public void percorrerArvore(TreeNode root, List<Integer> lista){
        if( root == null){
            return;
        }
        percorrerArvore(root.left, lista);
        lista.add(root.val);
        percorrerArvore(root.right, lista);

        

    }
    

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    
}




