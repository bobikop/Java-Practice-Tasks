package Trees;

public class LowestCommonAncestor {

public class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}


 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

    if (p.val < root.val && q.val < root.val){
        return  lowestCommonAncestor( root.left, p, q);
    }else if (p.val > root.val && q.val > root.val){
        return lowestCommonAncestor(root.right, p,q);
    }

 return root;



 }



}


//Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
//Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//Output: 6
//Explanation: The LCA of nodes 2 and 8 is 6.