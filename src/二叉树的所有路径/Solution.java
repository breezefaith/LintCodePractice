package 二叉树的所有路径;

import java.util.ArrayList;
import java.util.List;

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
        List list=new Solution().binaryTreePaths(root);
        System.out.println(list);
    }
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List result=new ArrayList();
        TreeNodePath treeNodePath=new TreeNodePath();
        binaryTreePaths(result,treeNodePath,root);
        return result;
    }
    public void binaryTreePaths(List result,TreeNodePath treeNodePath,TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            //是叶子节点则将路径添加到结果集
            treeNodePath.path.add(root.val);
            result.add(treeNodePath.toString());
            if(treeNodePath.path.size()>0){
                treeNodePath.path.remove(treeNodePath.path.size()-1);
            }
        }else{
            //不是叶子节点则继续遍历
            treeNodePath.path.add(root.val);
            binaryTreePaths(result,treeNodePath,root.left);
            binaryTreePaths(result,treeNodePath,root.right);
            if(treeNodePath.path.size()>0){
                treeNodePath.path.remove(treeNodePath.path.size()-1);
            }
        }
    }
    class TreeNodePath{
        List path;
        public TreeNodePath(){
            path=new ArrayList();
        }
        @Override
        public String toString(){
            if(path==null||path.size()==0){
                return null;
                //            return "";
            }
            StringBuffer sb=new StringBuffer();
            for(Object item:path){
                sb.append(item+"->");
            }
            return sb.substring(0,sb.length()-2);
        }
    }
}
