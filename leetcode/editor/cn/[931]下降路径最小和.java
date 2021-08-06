//给你一个 n x n 的 方形 整数数组 matrix ，请你找出并返回通过 matrix 的下降路径 的 最小和 。 
//
// 下降路径 可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列（即位于正下方或者沿对角线向左或者向右的第
//一个元素）。具体来说，位置 (row, col) 的下一个元素应当是 (row + 1, col - 1)、(row + 1, col) 或者 (row + 1
//, col + 1) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：matrix = [[2,1,3],[6,5,4],[7,8,9]]
//输出：13
//解释：下面是两条和最小的下降路径，用加粗标注：
//[[2,1,3],      [[2,1,3],
// [6,5,4],       [6,5,4],
// [7,8,9]]       [7,8,9]]
// 
//
// 示例 2： 
//
// 
//输入：matrix = [[-19,57],[-40,-5]]
//输出：-59
//解释：下面是一条和最小的下降路径，用加粗标注：
//[[-19,57],
// [-40,-5]]
// 
//
// 示例 3： 
//
// 
//输入：matrix = [[-48]]
//输出：-48
// 
//
// 
//
// 提示： 
//
// 
// n == matrix.length 
// n == matrix[i].length 
// 1 <= n <= 100 
// -100 <= matrix[i][j] <= 100 
// 
// Related Topics 数组 动态规划 矩阵 
// 👍 101 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //增加备忘录
    int[][] beiwanglu;
    public int minFallingPathSum(int[][] matrix) {
        int n =  matrix.length;
        //结果
        int res = Integer.MAX_VALUE;
        beiwanglu = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                beiwanglu[i][j] = 66666;
            }
        }
        //判断到最后一行的那个节点路径最小
        for (int i = 0;i<n ;i++){
            res = Math.min(res,dp(matrix,n-1,i));
        }
        return res;
    }
    /**
     * 从第一行到 matrix[i][j]的最小路径
     * @param matrix
     * @param i
     * @param j
     * @return
     */
    public int dp(int[][]matrix,int i,int j){

        //参数校验
        if (i < 0 || j <0 || i >= matrix.length || j>= matrix[0].length){
            return Integer.MAX_VALUE;
        }
        //basse case 如果i为0  此函数需要求matrix中第一行到matrix[i][j]的最小路径，即matrix[i][j]
        if (i == 0){
            return matrix[i][j-1];
        }
        if (beiwanglu[i][j] != 66666) {
            return beiwanglu[i][j];
        }
        int a = Math.min(dp(matrix,i-1,j-1),dp(matrix,i-1,j));
        int b = Math.min(a,dp(matrix,i-1,j+1));


        beiwanglu[i][j] = b+matrix[i][j];
        return beiwanglu[i][j];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
