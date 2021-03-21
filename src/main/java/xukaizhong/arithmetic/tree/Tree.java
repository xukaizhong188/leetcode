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
    private void clear(){
        if (null == rootTreeNode){
            return;
        }
        deleNode(rootTreeNode);
    }

    /**
     * 获取树的深度
     * @return
     */
    private int getTreeHight(){
        return getHight(rootTreeNode);
    }

    /**
     * 获取某个接节点的度
     * @param treeNode
     * @return
     */
    private int getHight(TreeNode treeNode){
        if (null == treeNode){
            return 0;
        }
        int rightHight = getHight(treeNode.getRightNode());
        int leftHight = getHight(treeNode.getLeftNode());
        int max = Math.max(rightHight,leftHight);
        return max+1;
    }

    /**
     * 获取二叉树的节点数
     * @return
     */
    private int getTreeNum(){
        return getNodeNum(rootTreeNode);
    }

    /**
     * 获取指定节点的节点数
     * @param treeNode
     * @return
     */
    private int getNodeNum(TreeNode treeNode){
        if (null == treeNode){
            return 0;
        }
        int leftNodeNum = getNodeNum(treeNode.getLeftNode());
        int rightNodeNum = getNodeNum(treeNode.getRightNode());
        return leftNodeNum +rightNodeNum+1;
    }

    /**
     * 获取指定节点的父节点
     * @param treeNode
     * @return
     */
    private TreeNode getParentNode(TreeNode treeNode){

        if (null == rootTreeNode || treeNode == rootTreeNode){
            return null;
        }
        return getParentNode(treeNode,rootTreeNode);
    }

    /**
     * 递归遍历子节点和目标节点是否一致
     * @param targetNode
     * @param childNode
     * @return
     */
    private TreeNode getParentNode(TreeNode targetNode,TreeNode childNode){
        if (null == childNode){
            return null;
        }
        if (childNode.getLeftNode() == targetNode || childNode.getRightNode() == targetNode){
            return childNode;
        }
        if (null != getParentNode(targetNode,childNode.getLeftNode())) {
            return getParentNode(targetNode,childNode.getLeftNode());
        }else {
            return getParentNode(targetNode,childNode.getRightNode());
        }
    }

    /**
     * 打印节点值
     * @param treeNode
     */
    private void op(TreeNode treeNode){
        if (null != treeNode){
            System.out.println(treeNode.getValue());
        }
    }

    /**
     * 先序遍历 根 左 右
     * @param treeNode
     */
    private void iterateFirstOrder(TreeNode treeNode){
        if (null == treeNode){
            return;
        }
        op(treeNode);
        insertLeftTreeNode(treeNode.getLeftNode());
        insertLeftTreeNode(treeNode.getRightNode());
    }

    /**
     * 中序遍历 左 根 右
     * @param treeNode
     */
    private void iterateMediumOrder(TreeNode treeNode){
        if (null == treeNode){
            return;
        }

        iterateMediumOrder(treeNode.getLeftNode());
        op(treeNode);
        iterateMediumOrder(treeNode.getRightNode());
    }

    /**
     * 后序遍历  左右根
     * @param treeNode
     */
    private void iterateLastOrder(TreeNode treeNode){
        if (null == treeNode){
            return;
        }

        iterateMediumOrder(treeNode.getLeftNode());
        iterateMediumOrder(treeNode.getRightNode());
        op(treeNode);
    }


    public static void main(String[] args) {

    }
}
