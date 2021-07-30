//给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的
//根节点的引用。 
//
// 一般来说，删除节点可分为两个步骤： 
//
// 
// 首先找到需要删除的节点； 
// 如果找到了，删除它。 
// 
//
// 说明： 要求算法时间复杂度为 O(h)，h 为树的高度。 
//
// 示例: 
//
// 
//root = [5,3,6,2,4,null,7]
//key = 3
//
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。
//
//一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。
//
//    5
//   / \
//  4   6
// /     \
//2       7
//
//另一个正确答案是 [5,2,6,null,4,null,7]。
//
//    5
//   / \
//  2   6
//   \   \
//    4   7
// 
// Related Topics 树 二叉搜索树 二叉树 
// 👍 486 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
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
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return null;
        }
        if (root.val == key){
            //如果当前节点等于被删除节点
            //1、如果无子节点，直接删除
            if (root.left == null && root.right == null){
                return null;
            }
            //2、如果只有一个子节点，直接使用子节点进行替换
            if (root.left != null && root.right == null){
                return root.left;
            }
            if (root.right != null && root.left == null){
                return root.right;
            }
            //3、如果有两个非空子节点，寻找左子树中最大值进行替换
            if (root.right != null && root.left !=null){
                //找到最大值
                TreeNode node = getMax(root.left);
                //值替换
                root.val = node.val;
                //删除最大值
                root.left = deleteNode(root.left,node.val);
            }
        }else if (root.val > key){
            //如果当前节点大于被删除节点
            //遍历左子树进行节点查找
            root.left = deleteNode(root.left,key);
        }else if (root.val < key){
            //如果当前节点小于被删除节点
            //遍历右子树进行节点查找
            root.right =  deleteNode(root.right,key);
        }
        return root;
    }
    public TreeNode getMax(TreeNode root){
        if (root == null){
            return null;
        }
        //遍历此节点的右节点为最大值
        while (root.right != null){
            root = root.right;
        }
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
