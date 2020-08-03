package likou.July;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyTwentyFour {
    /**
     * 给出一个区间的集合，请合并所有重叠的区间。
     * 示例 1:
     * 输入: [[1,3],[2,6],[8,10],[15,18]]
     * 输出: [[1,6],[8,10],[15,18]]
     * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
     * 示例?2:
     * 输入: [[1,4],[4,5]]
     * 输出: [[1,5]]
     * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
     * 通过次数119,320提交次数279,494
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        int[][] reslut = new int[intervals.length][2];
        int [] nowIntervals = intervals[0];

        for (int i = 0; i< intervals[0].length ;i++){

        }
        return null;
    }

    /**
     * 爱丽丝和鲍勃一起玩游戏，他们轮流行动。爱丽丝先手开局。
     * 最初，黑板上有一个数字?N?。在每个玩家的回合，玩家需要执行以下操作：
     * 选出任一?x，满足?0 < x < N 且?N % x == 0?。
     * 用 N - x?替换黑板上的数字 N 。
     * 如果玩家无法执行这些操作，就会输掉游戏。
     * 只有在爱丽丝在游戏中取得胜利时才返回?True，否则返回 false。假设两个玩家都以最佳状态参与游戏。
     * 示例 1：
     * 输入：2
     * 输出：true
     * 解释：爱丽丝选择 1，鲍勃无法进行操作。
     * 示例 2：
     * 输入：3
     * 输出：false
     * 解释：爱丽丝选择 1，鲍勃也选择 1，然后爱丽丝无法进行操作。
     * 提示：
     * 1 <= N <= 1000
     * 通过次数30,702提交次数44,170
     * @param N
     * @return
     */
    public static boolean divisorGame(int N) {

        return false;
    }


    public static void main(String[] args) {
        System.out.println(divisorGame(4));
    }
}
