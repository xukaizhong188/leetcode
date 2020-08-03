package likou;

import java.util.ArrayList;
import java.util.List;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulySix {
    /**
     * 给你一个整数?n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
     * 示例 1：
     * 输入：n = 234
     * 输出：15
     * 解释：
     * 各位数之积 = 2 * 3 * 4 = 24
     * 各位数之和 = 2 + 3 + 4 = 9
     * 结果 = 24 - 9 = 15
     * 示例 2：
     * 输入：n = 4421
     * 输出：21
     * 解释：
     * 各位数之积 = 4 * 4 * 2 * 1 = 32
     * 各位数之和 = 4 + 4 + 2 + 1 = 11
     * 结果 = 32 - 11 = 21
     * ?
     *
     * 提示：
     *
     * 1 <= n <= 10^5
     *
     * @param n
     * @return
     */
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int gewei = 0;

        while(n > 0){
            gewei = n % 10;
            n = n / 10;
            product = product * gewei;
            sum = sum + gewei;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
