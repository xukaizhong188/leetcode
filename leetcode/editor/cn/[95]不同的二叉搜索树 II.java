//给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
//二叉查找树（Binary Search Tree），（又：二叉搜索树，二叉排序树）它或者是一棵空树，或者是具有下列性质的二叉树： 若它的左子树不空，
// 则左子树上所有结点的值均小于它的根结点的值； 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树。
// 二叉搜索树作为一种经典的数据结构，它既有链表的快速插入与删除操作的特点，又有数组快速查找的优势；
// 示例：
// 输入：3
//输出：
//[
//  [1,null,3,2],
//  [3,2,null,1],
//  [3,1,null,null,2],
//  [2,1,3],
//  [1,null,2,null,3]
//]
//解释：
//以上的输出对应以下 5 种不同结构的二叉搜索树：
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3
// 提示：
// 0 <= n <= 8
// Related Topics 树 动态规划
// 👍 819 👎 0


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


    public List<TreeNode> generateTrees(int n) {
        if (n == 0){
            return new ArrayList();
        }
        return count(1,n);
    }

    /**
     * 计算low到hight共有的情况
     * @param low
     * @param hight
     * @return
     */
    public List<TreeNode> count(int low,int hight){
        List<TreeNode> res = new ArrayList();
        if (low > hight){
            res.add(null);
            return res;
        }

        for (int i = low ;i <= hight ;i++){
            //左子树的list
            List<TreeNode> leftList = count(low,i-1);
            //右子树的list
            List<TreeNode> rightList = count(i+1,hight);
            //穷举以i为根节点的符合条件的二叉搜索树
            for (TreeNode leftNode:leftList){
                for (TreeNode rightNode:rightList){
                    TreeNode node = new TreeNode(i);
                    node.right = rightNode;
                    node.left = leftNode;
                    res.add(node);
                }
            }
        }
        return res;

    }
}

//leetcode submit region end(Prohibit modification and deletion)
