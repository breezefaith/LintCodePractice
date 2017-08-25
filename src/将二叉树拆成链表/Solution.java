package ���������������;

/***
 * ��һ�ö���������ǰ���������Ϊһ����������ν�ļ�������˵���ö������� right ָ�룬����ʾ�����е� next ָ�롣
 * ����
               1
                \
     1          2
     / \          \
     2   5    =>    3
     / \   \          \
     3   4   6          4
                         \
                           5
                            \
                             6
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1),
                p1=new TreeNode(2),
                p2=new TreeNode(3);
        root.left=p1;
        root.right=p2;
        new Solution().flatten(root);
    }
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
    }
    public TreeNode flatten(TreeNode tail,TreeNode root){
        if(root==null){
            return tail;
        }
        if (root.left==null&&root.right==null){
            return tail;
        }else if(root.left==null&&root.right!=null){
            tail=flatten(tail,root.right);
        }else if (root.left!=null&&root.right==null){
            TreeNode p=root.right;
            tail=flatten(tail,root.left);
            flatten(tail,p);
            tail.right=p;
        }else{
            tail=flatten(tail,root.right);
            tail=flatten(tail,root.left);
        }
        return tail;
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