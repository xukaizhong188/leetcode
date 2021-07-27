//给定一棵树的前序遍历 preorder 与中序遍历 inorder。请构造二叉树并返回其根节点。
// 示例 1:
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 示例 2:
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 提示:
// 1 <= preorder.length <= 3000 
// inorder.length == preorder.length 
// -3000 <= preorder[i], inorder[i] <= 3000 
// preorder 和 inorder 均无重复元素 
// inorder 均出现在 preorder 
// preorder 保证为二叉树的前序遍历序列 
// inorder 保证为二叉树的中序遍历序列
// Related Topics 树 数组 哈希表 分治 二叉树 
// 👍 1121 👎 0


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
    private Map<Integer, Integer> indexMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder,int preLeft,int preRight,int inLeft,int inRight) {
        if (preLeft > preRight){
            return null;
        }
        int preRoot = preLeft;
        //根节点
        TreeNode root = new TreeNode(preorder[preRoot]);
        //中序遍历中根节点的位置
        //int inRoot = getInRoot(root,inorder);
        int inRoot = indexMap.get(preorder[preRoot]);
        //前序遍历需要遍历的数组长度为左节点
        int leftLength = inRoot - inLeft;
        //左节点
        root.left = buildTree(preorder,inorder,preLeft+1,preLeft+leftLength,inLeft,inRoot-1);

        //右节点
        root.right = buildTree(preorder,inorder,preLeft+leftLength+1,preRight,inRoot+1,inRight);


        return root;
    }

    public int getInRoot(TreeNode treeNode,int[] inorder){
        for (int i = 0;i<inorder.length;i++){
            if (inorder[i] == treeNode.val){
                return i;
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
