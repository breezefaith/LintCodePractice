package ¶þ²æÊ÷²ãÐò±éÀú;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<TreeNode> queue=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        return result;
    }
    public void levelOrderTraversal(List list,List<TreeNode> queue,TreeNode root){
        if(queue!=null){
            TreeNode node=queue.get(0);
            levelOrderTraversal(list,queue,node);
        }
        if(root==null){
            return;
        }

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