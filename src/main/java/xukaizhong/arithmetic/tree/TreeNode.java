package xukaizhong.arithmetic.tree;

/**
 * @author xukaizhong
 * @date 2021/3/2111:23 上午
 * @description ：左右拉链法
 */

public class TreeNode {
    int value;
    /**
     * 左节点
     */
    TreeNode leftNode;
    /**
     * 右节点
     */
    TreeNode rightNode;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
