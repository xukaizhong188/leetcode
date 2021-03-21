package xukaizhong.arithmetic.tree;

/**
 * @author xukaizhong
 * @date 2021/3/2111:38 上午
 * @description ：
 */
public class Tree {
    /**
     * 根节点
     */
    private TreeNode rootTreeNode;

    public TreeNode getRootTreeNode() {
        return rootTreeNode;
    }

    public void setRootTreeNode(TreeNode rootTreeNode) {
        this.rootTreeNode = rootTreeNode;
    }

    /**
     * 判断是否为空二叉树
     * @return
     */
    private boolean checkTreeIsEmty(){
        if (null == rootTreeNode){
            return false;
        }
        return true;
    }

    /**
     * 添加右节点
     * @param childNode
     */
    private void insertRihtTreeNode(TreeNode childNode){
        if (checkTreeIsEmty()) {
            rootTreeNode.setRightNode(childNode);
        }
    }

    /**
     * 添加左节点
     * @param childNode
     */
    private void insertLeftTreeNode(TreeNode childNode){
        if (checkTreeIsEmty()) {
            rootTreeNode.setLeftNode(childNode);
        }
    }
    /**
     * 删除节点，使用递归将左右子树进行删除
     * @param treeNode
     */
    private void deleNode(TreeNode treeNode){

        if (null == treeNode){
            return;
        }
        deleNode(treeNode.getLeftNode());
        deleNode(treeNode.getRightNode());
        treeNode = null;
    }

    /**
     * 清空二叉树
     */
    private void clera(){
        if (null == rootTreeNode){
            return;
        }
        deleNode(rootTreeNode);
    }

    public static void main(String[] args) {

    }
}
