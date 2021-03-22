package likou.tree;

import xukaizhong.arithmetic.tree.Tree;

/**
 * @author xukaizhong
 * @date 2021/3/215:34 下午
 * @description ：最小高度树
 */
public class MinHightTree {
    /**
     * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {

        for (int i = 0;i <nums.length;i++){

        }
        //将中间节点作为根节点
        TreeNode mNode = new TreeNode(nums[nums.length/2]);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
