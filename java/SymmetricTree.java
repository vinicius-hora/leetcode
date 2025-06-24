package java;
/*
https://leetcode.com/problems/symmetric-tree/
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false
 

Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
 

Follow up: Could you solve it both recursively and iteratively?
 */
public class SymmetricTree {

     public boolean isSymmetric(TreeNode root) {
 
        if( root == null){
            return true;
        }

        return percorrerArvore(root.left, root.right);
        
    }

     public boolean percorrerArvore(TreeNode a, TreeNode b){
        if( a == null && b == null){
            return true;
        }
        if( a == null) {
            return false;
        }
        if( b == null){ 
            return false;
        }

        return (a.val == b.val) && percorrerArvore(a.left, b.right) && percorrerArvore(a.right, b.left);

    }

   
}






