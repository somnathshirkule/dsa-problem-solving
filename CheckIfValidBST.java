
class TreeNode {
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
 
public class CheckIfValidBST {
    public boolean isValidBST(TreeNode root) {
        if(root.left != null && root.left.val >= root.val)
            return false;
        if(root.right != null && root.right.val <= root.val)
            return false;
        if(root.right == null && root.left == null)
            return true;
        if((root.right != null && root.right.val > root.val) && (root.left != null && root.left.val < root.val))
            return true;
        return isValidBST(root.left) && isValidBST(root.right);
    }
}