package ¶þ²æÊ÷²ãÐò±éÀú;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String []args){
        TreeNode root=new TreeNode(3),
                n1=new TreeNode(9),
                n2=new TreeNode(20),
                n3=new TreeNode(15),
                n4=new TreeNode(7);
        n2.left=n3;
        n2.right=n4;
        root.left=n1;
        root.right=n2;
        List list=new Solution().levelOrder(root);
        System.out.println(list);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<TreeNode> queue=new LinkedList<>();
        List<TreeNode> nextQueue=new LinkedList<>();
        List<List<Integer>> result=new LinkedList<>();
        List<Integer> currentLevel=new LinkedList<>();
        queue.add(root);
        levelOrderTraversal(result,currentLevel,queue,nextQueue);
        return result;
    }
    public void levelOrderTraversal(List result,List currentLevel,List queue,List nextQueue){
        if(queue!=null&&queue.size()!=0){
            TreeNode node=(TreeNode) queue.remove(0);
            if(node!=null) {
                currentLevel.add(node.val);
                nextQueue.add(node.left);
                nextQueue.add(node.right);
            }
            levelOrderTraversal(result,currentLevel,queue,nextQueue);
        }else{
            if(nextQueue.size()==0){
                return;
            }
            result.add(currentLevel);
            currentLevel=new LinkedList();
            queue=nextQueue;
            nextQueue=new LinkedList<>();
            levelOrderTraversal(result,currentLevel,queue,nextQueue);
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

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}