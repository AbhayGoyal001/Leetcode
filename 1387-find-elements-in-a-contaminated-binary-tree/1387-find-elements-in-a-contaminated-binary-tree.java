/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    int first = 0;
    HashSet<Integer> hs = new HashSet<>();
    public FindElements(TreeNode root) {
        build(root);
    }
    public void build(TreeNode root){
       if(root == null)
            return;
        if(first == 0){
            root.val = 0;
            first = -1;
        }
        hs.add(root.val);
        if(root.left != null)
            root.left.val = root.val*2+1;
        if(root.right != null)
            root.right.val = root.val*2+2;
        build(root.left);
        build(root.right);
    }
    
    public boolean find(int target) {
        return hs.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */