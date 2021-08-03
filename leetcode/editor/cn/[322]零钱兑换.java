//给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。 
//
// 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。 
//
// 你可以认为每种硬币的数量是无限的。 
//
// 
//
// 示例 1： 
//
// 
//输入：coins = [1, 2, 5], amount = 11
//输出：3 
//解释：11 = 5 + 5 + 1 
//
// 示例 2： 
//
// 
//输入：coins = [2], amount = 3
//输出：-1 
//
// 示例 3： 
//
// 
//输入：coins = [1], amount = 0
//输出：0
// 
//
// 示例 4： 
//
// 
//输入：coins = [1], amount = 1
//输出：1
// 
//
// 示例 5： 
//
// 
//输入：coins = [1], amount = 2
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= coins.length <= 12 
// 1 <= coins[i] <= 231 - 1 
// 0 <= amount <= 104 
// 
// Related Topics 广度优先搜索 数组 动态规划 
// 👍 1399 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //暴力递归：超时
    public int coinChange(int[] coins, int amount) {
        if (amount < 0){
            return -1;
        }
        if (amount<1){
            return 0;
        }
        int result = Integer.MAX_VALUE;
        for (int coin:coins){
            int res = coinChange(coins,amount-coin);
            if (res < result && res >=0){
                result = res + 1;
            }
        }
        if (result == Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }
    //暴力递归
    Map<Integer,Integer> resMap = new HashMap();
    public int coinChange(int[] coins, int amount) {
        if (amount < 0){
            return -1;
        }
        if (amount<1){
            return 0;
        }

        if (resMap.get(amount) != null){
            return resMap.get(amount);
        }
        int result = Integer.MAX_VALUE;
        for (int coin:coins){
            int res = coinChange(coins,amount-coin);
            if (res < result && res >=0){
                result = res + 1;
            }
        }
        if (result == Integer.MAX_VALUE){
            result = -1;
        }
        resMap.put(amount,result);
        return result;
    }
    //
    public int coinChange(int[] coins, int amount) {
        if(amount < 1){
            return 0;
        }
        return coinChange(coins,amount,new int[amount]);
    }
    public int coinChange(int[] coins, int amount,int[] beiwanglu) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }

        if (beiwanglu[amount-1] > 0){
            return beiwanglu[amount-1];
        }
        int result = Integer.MAX_VALUE;
        for (int coin:coins){
            int res = coinChange(coins,amount-coin,beiwanglu);
            if (res < result && res >=0){
                result = res + 1;
            }
        }
        if (result == Integer.MAX_VALUE){
            result = -1;
        }
        beiwanglu[amount-1] = result;
        return result;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
