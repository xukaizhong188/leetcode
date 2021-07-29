//给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。 
//
// 两棵树重复是指它们具有相同的结构以及相同的结点值。 
//
// 示例 1： 
//
//         1
//       / \
//      2   3
//     /   / \
//    4   2   4
//       /
//      4
// 
//
// 下面是两个重复的子树： 
//
//       2
//     /
//    4
// 
//
// 和 
//
//     4
// 
//
// 因此，你需要以列表的形式返回上述重复子树的根结点。 
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 
// 👍 291 👎 0


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
    Map<String,String> treeNodeStringMap = new HashMap();
    Map<String,String> treeNodeStringMap2 = new HashMap();
    List<TreeNode> treeNodeList = new ArrayList();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        getNode(root);
        return treeNodeList;
    }
    //遍历树，生成每个节点为根节点的标识
    public String getNode(TreeNode root){
        if (root == null){
            return "*";
        }
        String key =getNode(root.left)+ "," + getNode(root.right)+ ","+ root.val;


        /*System.out.println(key);
        System.out.println(treeNodeStringMap);
        System.out.println(treeNodeStringMap2);*/

        if (treeNodeStringMap.containsKey(key) && !treeNodeStringMap2.containsKey(key) ){
            treeNodeList.add(root);
            treeNodeStringMap2.put(key,"1");
        }


        if (!treeNodeStringMap.containsKey(key)){
            treeNodeStringMap.put(key,"1");
        }

        return key;
    }



}
//leetcode submit region end(Prohibit modification and deletion)
