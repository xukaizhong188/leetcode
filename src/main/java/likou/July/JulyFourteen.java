package likou.July;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyFourteen {
    /**
     * 给你一个长度为?n?的整数数组，请你判断在 最多 改变?1 个元素的情况下，该数组能否变成一个非递减数列。
     * 我们是这样定义一个非递减数列的：?对于数组中所有的?i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。
     * 示例 1:
     * 输入: nums = [4,2,3]
     * 输出: true
     * 解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
     * 示例 2:
     * 输入: nums = [4,2,1]
     * 输出: false
     * 解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
     * 说明：
     * 1 <= n <= 10 ^ 4
     * - 10 ^ 5?<= nums[i] <= 10 ^ 5
     * @param nums
     * @return
     */
    public static boolean checkPossibility(int[] nums) {
        //暴力解法:遍历并进行比较，正序比较及反序比较，注意：移动一个元素可以移动大数，也可以移动小数
        int num = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length ;i++){
            for (int j = i; j < nums.length ;j++){
                if (nums[i] > nums[j]){
                    num++;
                    break;
                }

            }
            if (num >=2){
                break;
            }
        }
        for (int i = nums.length-1; i >= 0  ;i--){
            for (int j = i; j >= 0 ;j--){
                if (nums[i] < nums[j]){
                    num2++;
                    break;
                }

            }
            if (num2 >=2){
                break;
            }
        }
        if (num >= 2 && num2 >=2){
            return false;
        }else {
            return true;
        }
    }
    public static boolean checkPossibility2(int[] nums) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPossibility(new int[]{4,2,3}));
        System.out.println(checkPossibility(new int[]{3,4,2,3}));
        System.out.println(checkPossibility(new int[]{1,5,4,6,7,10,8,9}));
        System.out.println(checkPossibility(new int[]{2,3,3,2,4}));

        System.out.println(checkPossibility2(new int[]{4,2,3}));
        System.out.println(checkPossibility2(new int[]{3,4,2,3}));
        System.out.println(checkPossibility2(new int[]{1,5,4,6,7,10,8,9}));
        System.out.println(checkPossibility2(new int[]{2,3,3,2,4}));
    }
}
