//给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？ 
// 示例:
// 输入: 3
//输出: 5
//解释:
//给定 n = 3, 一共有 5 种不同结构的二叉搜索树:
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3 
// Related Topics 树 动态规划 
// 👍 1073 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[][] beiwanglu;
    public int numTrees(int n) {
        beiwanglu = new int[n+1][n+1];
        return count(1,n);
    }

    /**
     * 计算low到hight共有的情况
     * @param low
     * @param hight
     * @return
     */
    public int count(int low,int hight){
        if (low > hight){
            return 1;
        }
        if (beiwanglu[low][hight] != 0){
            return beiwanglu[low][hight];
        }
        int result = 0 ;
        for (int i = low ;i <= hight ;i++){
            int leftCount = count(low,i-1);
            int rightCount = count(i+1,hight);
            result = result + leftCount*rightCount;
        }
        beiwanglu[low][hight] = result;
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
