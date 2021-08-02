//给你一棵以 root 为根的 二叉树 ，请你返回 任意 二叉搜索子树的最大键值和。 
//
// 二叉搜索树的定义如下： 
//
// 
// 任意节点的左子树中的键值都 小于 此节点的键值。 
// 任意节点的右子树中的键值都 大于 此节点的键值。 
// 任意节点的左子树和右子树都是二叉搜索树。 
// 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：root = [1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]
//输出：20
//解释：键值为 3 的子树是和最大的二叉搜索树。
// 
//
// 示例 2： 
//
// 
//
// 
//输入：root = [4,3,null,1,2]
//输出：2
//解释：键值为 2 的单节点子树是和最大的二叉搜索树。
// 
//
// 示例 3： 
//
// 
//输入：root = [-4,-2,-5]
//输出：0
//解释：所有节点键值都为负数，和最大的二叉搜索树为空。
// 
//
// 示例 4： 
//
// 
//输入：root = [2,1,3]
//输出：6
// 
//
// 示例 5： 
//
// 
//输入：root = [5,4,8,3,null,6,3]
//输出：7
// 
//
// 
//
// 提示： 
//
// 
// 每棵树有 1 到 40000 个节点。 
// 每个节点的键值在 [-4 * 10^4 , 4 * 10^4] 之间。 
// 
// Related Topics 树 深度优先搜索 二叉搜索树 动态规划 二叉树 
// 👍 52 👎 0


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
    int result = 0;
    public int maxSumBST(TreeNode root) {
        getMax(root);
        return result;
    }
    public void getMax(TreeNode root){
        if (root == null){
            return ;
        }

        //判断自己是否为BST
        if (isBST(root,null,null)){
            //如果是二叉搜索树则进行自身求和
            int num = find(root);
            if (num >= result){
                result = num;
            }
        }
        getMax(root.left);
        getMax(root.right);
    }
    /**
     * 求节点和
     * @param root
     * @return
     */
    public int find(TreeNode root){
        int sum = 0;
        if (root == null){
            return 0;
        }
        sum = root.val + find(root.right) +find(root.left);
        return sum;
    }
    /**
     * 校验一个树是否为二叉搜索树
     * @param root
     * @param min
     * @param max
     * @return
     */
    public boolean isBST(TreeNode root,TreeNode min,TreeNode max){
        if (root == null){
            return true;
        }
        if (min != null && root.val <= min.val){
            return false;
        }
        if (max != null && root.val >= max.val){
            return false;
        }

        return isBST(root.left,min,root) && isBST(root.right,root,max);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
