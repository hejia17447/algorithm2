package org.algorithm;

/**
 * 树
 * @author jiahe
 */
public class TreeNode {

    public int val;
    public TreeNode left;

    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return val + "," + (left == null ? "null" : left.toString())
                + "," + (right == null ? "null" : right.toString());
    }
}
