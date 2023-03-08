package Trees;

public class PathSum {

    public static class TNode {
        public int val;
        public TNode left;
        public TNode right;


    }

    class Solution {
        public boolean hasPathSum(TNode root, int targetSum) {
            if (root == null) {
                return false;
            }
            if (root.val == targetSum && root.left == null && root.right == null) {
                return true;
            }
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        }
    }

}
