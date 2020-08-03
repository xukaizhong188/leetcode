package likou;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulySeven {
    /**
     * 给你一个有效的 IPv4 地址?address，返回这个 IP 地址的无效化版本。
     * 所谓无效化?IP 地址，其实就是用?"[.]"?代替了每个 "."。
     * 示例 1：
     * 输入：address = "1.1.1.1"
     * 输出："1[.]1[.]1[.]1"
     * 示例 2：
     * 输入：address = "255.100.50.0"
     * 输出："255[.]100[.]50[.]0"
     * 提示：
     * 给出的?address?是一个有效的 IPv4 地址
     *
     * @param address
     * @return
     */
    public static String defangIPaddr(String address) {

        return address.replaceAll("\\.","[.]");
    }

    /**
     * StringBuilder要比String效率更高，关键在于StringBuilder的值的char非final，减少了销毁创建内存区域的开销。
     * @param address
     * @return
     */
    public static String defangIPaddr2(String address) {

        char[] addressChar = address.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i<addressChar.length;i++){
            if ('.' == addressChar[i]){
                stringBuilder.append("[.]");
            }else {
                stringBuilder.append(addressChar[i]);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
     * 说明:?叶子节点是指没有子节点的节点。
     * 示例:?
     * 给定如下二叉树，以及目标和 sum = 22，
     *               5
     *              / \
     *             4   8
     *            /   / \
     *           11  13  4
     *          /  \      \
     *         7    2      1
     * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
     *
     * 解题：遍历（先中后层次）+然后相加
     *
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        boolean result = false;
        return result;

    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }