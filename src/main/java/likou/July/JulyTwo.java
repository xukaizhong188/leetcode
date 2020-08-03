package likou.July;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyTwo {
    /**
     * 给你一个数组?candies?和一个整数?extraCandies?，其中?candies[i]?代表第 i 个孩子拥有的糖果数目。
     *  对每一个孩子，检查是否存在一种方案，将额外的?extraCandies?个糖果分配给孩子们之后，此孩子有 最多?的糖果。注意，允许有多个孩子同时拥有 最多?的糖果数目。
     *  示例 1：
     *  输入：candies = [2,3,5,1,3], extraCandies = 3
     *  输出：[true,true,true,false,true]
     *  解释：
     *  孩子 1 有 2 个糖果，如果他得到所有额外的糖果（3个），那么他总共有 5 个糖果，他将成为拥有最多糖果的孩子。
     *  孩子 2 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
     *  孩子 3 有 5 个糖果，他已经是拥有最多糖果的孩子。
     *  孩子 4 有 1 个糖果，即使他得到所有额外的糖果，他也只有 4 个糖果，无法成为拥有糖果最多的孩子。
     *  孩子 5 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
     *  示例 2：
     *  输入：candies = [4,2,1,1,2], extraCandies = 1
     *  输出：[true,false,false,false,false]
     *  解释：只有 1 个额外糖果，所以不管额外糖果给谁，只有孩子 1 可以成为拥有糖果最多的孩子。
     *  示例 3：
     *  输入：candies = [12,1,12], extraCandies = 10
     *  输出：[true,false,true]
     *  提示：
     *
     *  2 <= candies.length <= 100
     *  1 <= candies[i] <= 100
     *  1 <= extraCandies <= 50
     * @param candies
     * @param extraCandies
     * @return
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        //找出最大的
        int max = 0;
        for (int i = 0;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }

        for (int i = 0;i<candies.length;i++){
            result.add(max - candies[i] <= extraCandies);
        }

        return result;
    }

    /**
     * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
     * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
     * 示例 1：
     * 输入：nums = [2,5,1,3,4,7], n = 3
     * 输出：[2,3,5,4,1,7]
     * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
     * 示例 2：
     * 输入：nums = [1,2,3,4,4,3,2,1], n = 4
     * 输出：[1,4,2,3,3,2,4,1]
     * 示例 3：
     * 输入：nums = [1,1,2,2], n = 2
     * 输出：[1,2,1,2]
     * 提示：
     * 1 <= n <= 500
     * nums.length == 2n
     * 1 <= nums[i] <= 10^3
     * @param nums
     * @param n
     * @return
     */
    public static int[] shuffle1(int[] nums, int n) {

        int[] result = new int[nums.length];
        int[] num1 = new int[n];
        int[] num2 = new int[n];
        for (int i = 0;i < nums.length ;i ++){
            if (i < n){
                num1[i] = nums[i];
            }else {
                num2[i-n] = nums[i];
            }
        }
        boolean userNum1 = true;
        int j = 0;
        for (int i = 0 ;i < result.length ;i++){
            if (userNum1){
                result[i] = num1[j];
                userNum1 = false;
            }else {
                result[i] = num2[j];
                userNum1 = true;
                j++;
            }

        }

        return result;
    }
    public static int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];
        int j = 0;
        for (int i = 0;i < nums.length ;i+=2){
            result[i] = nums[j];
            j++;
        }
        for (int i = 1 ;i < result.length ;i+=2){
            result[i] = nums[j];
            j++;
        }

        return result;
    }

    /**
     *
     字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
     比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     示例 1：
     输入: s = "abcdefg", k = 2
     输出: "cdefgab"
     示例 2：
     输入: s = "lrloseumgh", k = 6
     输出: "umghlrlose"
     限制：
     1 <= k < s.length <= 10000
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        String beginString = s.substring(0,n);
        String endString = s.substring(n,s.length());
        return endString+beginString;
    }



    /**
     * ListNode简介
     * 实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
     * 示例：
     * 输入：单向链表a->b->c->d->e->f中的节点c
     * 结果：不返回任何数据，但该链表变为a->b->d->e->f
     * @author xukaizhong
     * @date 2020-07-02 16:04
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
     * 输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
     * 示例 1：
     * 输入：guess = [1,2,3], answer = [1,2,3]
     * 输出：3
     * 解释：小A 每次都猜对了。
     * 示例 2：
     * 输入：guess = [2,2,3], answer = [3,2,1]
     * 输出：1
     * 解释：小A 只猜对了第二次。
     * 限制：
     * guess的长度 = 3
     * answer的长度 = 3
     * guess的元素取值为 {1, 2, 3} 之一。
     * answer的元素取值为 {1, 2, 3} 之一。
     * @param guess
     * @param answer
     * @return
     */
    public int game(int[] guess, int[] answer) {
        int result = 0;
        for (int i= 0;i<guess.length;i++){
            if (guess[i] == answer[i]){
                result++;
            }
        }

        return result;
    }

    /**
     * ?给定字符串J?代表石头中宝石的类型，和字符串?S代表你拥有的石头。?S?中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     * J?中的字母不重复，J?和?S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     * 示例 1:
     * 输入: J = "aA", S = "aAAbbbb"
     * 输出: 3
     * 示例 2:
     * 输入: J = "z", S = "ZZ"
     * 输出: 0
     * 注意:
     * S?和?J?最多含有50个字母。
     * ?J?中的字符不重复。
     * @param J
     * @param S
     * @return
     */
    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        char[] jChar = J.toCharArray();
        char[] sChar = S.toCharArray();
        for (int i = 0;i<sChar.length;i++){
            for (int j = 0;j<jChar.length;j++){
                if (jChar[j] == sChar[i]){
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * 给定一个?n x n?矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
     * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
     * 示例：
     * matrix = [
     *    [ 1,  5,  9],
     *    [10, 11, 13],
     *    [12, 13, 15]
     * ],
     * k = 8,
     * 返回 13。
     * 提示：
     * 你可以假设 k 的值永远是有效的，1 ≤ k ≤ n2?。
     * @param matrix
     * @param k
     * @return
     */
    public static int kthSmallest(int[][] matrix, int k) {
        //重新排序，寻找第k个元素
        List<Integer> list = new ArrayList<Integer>();

        int m = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);

        return list.get(k-1);
    }

    /**
     * 按照顺序遍历，直接找并返回
     * @param matrix
     * @param k
     * @return
     */
    public static int kthSmallest2(int[][] matrix, int k) {
        //找到k个最小值并返回K个最小值的最大值
        int result = matrix[0][0];
        int min = matrix[0][0];
        int m = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                //还没达到k个最小值
                if (m <= k-1){
                    if (min <= matrix[i][j]){
                        min = matrix[i][j];
                    }
                    result = min;
                    m++;
                }else {
                    if (matrix[ i][j] <= min){
                        result = matrix[i][j];
                    }
                }
            }
        }

        return result;
    }
    public static int kthSmallest3(int[][] matrix, int k) {
        //获取矩阵n
        int n = matrix[0].length;
        int start = k / n;
        //还需要找find个数
        int find = k- start;

        int result = matrix[0][0];
        int min = matrix[0][0];
        int m = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                //还没达到k个最小值
                if (m <= k-1){
                    if (min <= matrix[i][j]){
                        min = matrix[i][j];
                    }
                    result = min;
                    m++;
                }else {
                    if (matrix[ i][j] <= min){
                        result = matrix[i][j];
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        //[[],[],[],[],[]]
        //5
        int[][] a2 = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[][] a1 = new int[][]{{1,5,9},{10,11,13},{12,13,15}};
        int[][] a = new int[][]{{-5}};
        System.out.println(kthSmallest2(a2,5));
        //System.out.println(kthSmallest2(a1,8));
        //System.out.println(kthSmallest2(a,1));
    }
}
