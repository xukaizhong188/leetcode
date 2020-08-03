package likou.July;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyEight {
    /**
     * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，
     * 长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
     * 返回的长度需要从小到大排列。
     * 示例：
     * 输入：
     * shorter = 1
     * longer = 2
     * k = 3
     * 输出：{3,4,5,6}
     * 提示：
     * 0 < shorter <= longer
     * 0 <= k <= 100000
     *
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public static int[] divingBoard(int shorter, int longer, int k) {
        return null;
    }

    /**
     * 给你一个非负整数?num?，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
     * 示例 1：
     * 输入：num = 14
     * 输出：6
     * 解释：
     * 步骤 1) 14 是偶数，除以 2 得到 7 。
     * 步骤 2） 7 是奇数，减 1 得到 6 。
     * 步骤 3） 6 是偶数，除以 2 得到 3 。
     * 步骤 4） 3 是奇数，减 1 得到 2 。
     * 步骤 5） 2 是偶数，除以 2 得到 1 。
     * 步骤 6） 1 是奇数，减 1 得到 0 。
     * 示例 2：
     * 输入：num = 8
     * 输出：4
     * 解释：
     * 步骤 1） 8 是偶数，除以 2 得到 4 。
     * 步骤 2） 4 是偶数，除以 2 得到 2 。
     * 步骤 3） 2 是偶数，除以 2 得到 1 。
     * 步骤 4） 1 是奇数，减 1 得到 0 。
     * 示例 3：
     * 输入：num = 123
     * 输出：12
     * 提示：
     * 0 <= num <= 10^6
     * @param num
     * @return
     */
    public static int numberOfSteps(int num) {
        int result = 0;
        while (num != 0){
            if(num % 2 == 0){
                num = num / 2;
            }else {
                num = num -1;
            }
            result++;
            System.out.println(num);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        //System.out.println(divingBoard(1,2,3));
    }
}