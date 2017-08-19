package ¿ËÂ¡¶þ²æÊ÷;

public class Solution {
    public  static void main(String []args){

    }

    public TreeNode cloneTree(TreeNode root) {
        // Write your code here
        TreeNode newRoot=cloneTree1(root);
        return newRoot;
    }
    public TreeNode cloneTree1(TreeNode oldRoot){
        if (oldRoot==null) {
            return null;
        }
        TreeNode newRoot=new TreeNode(oldRoot.val);
        newRoot.left=cloneTree1(oldRoot.left);
        newRoot.right=cloneTree(oldRoot.right);
        return newRoot;
    }
}
class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}