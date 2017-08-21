package 二叉树的路径和;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static void main(String []args){
        TreeNode root=new TreeNode(1),
                n1=new TreeNode(1),
                n2=new TreeNode(1),
                n3=new TreeNode(1),
                n4=new TreeNode(1),
                n5=new TreeNode(1),
                n6=new TreeNode(1),
                n7=new TreeNode(1),
                n8=new TreeNode(1),
                n9=new TreeNode(1),
                n10=new TreeNode(1),
                n11=new TreeNode(1),
                n12=new TreeNode(1),
                n13=new TreeNode(1),
                n14=new TreeNode(1);
        n2.left=n7;
        n2.right=n8;
        n3.left=n9;
        n3.right=n10;
        n5.left=n11;
        n5.right=n12;
        n6.left=n13;
        n6.right=n14;
        n4.left=n5;
        n4.right=n6;

        n1.left=n2;
        n1.right=n3;
        root.left=n1;
        root.right=n4;
        List list=new Solution().binaryTreePathSum(root,4);
        System.out.println(list);
    }

    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        List result=new ArrayList();
        List currentPath=new ArrayList();
        binaryTreePathSum(result,currentPath,root,target);
        return result;
    }
    public void binaryTreePathSum(List result,List currentPath,TreeNode root,int target){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            if(root.val==target){
                currentPath.add(root.val);
                List temp=new ArrayList();
                temp.addAll(currentPath);
                result.add(temp);
            }else{
                currentPath.add(root.val);
            }
            if(currentPath.size()>0){
                currentPath.remove(currentPath.size()-1);
            }
        }else{
            currentPath.add(root.val);
            binaryTreePathSum(result,currentPath,root.left,target-root.val);
            binaryTreePathSum(result,currentPath,root.right,target-root.val);
            if(currentPath.size()>0){
                currentPath.remove(currentPath.size()-1);
            }
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