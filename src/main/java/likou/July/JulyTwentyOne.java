package likou.July;

import java.util.HashMap;
import java.util.Map;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyTwentyOne {

    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *      不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *      示例 1:
     *      给定数组 nums = [1,1,2],
     *      函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
     *      你不需要考虑数组中超出新长度后面的元素。
     *      示例 2:
     *      给定 nums = [0,0,1,1,1,2,2,3,3,4],
     *      函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     *      你不需要考虑数组中超出新长度后面的元素。
     *      说明:
     *      为什么返回数值是整数，但输出的答案是数组呢?
     *      请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     *      你可以想象内部操作如下:
     *      // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
     *      int len = removeDuplicates(nums);
     *      // 在函数里修改输入数组对于调用者是可见的。
     *      // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
     *      for (int i = 0; i < len; i++) {
     *      print(nums[i]);
     *      }
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int result =0;
        int point = 0;//需要改变值的数组指针
        int newValuePoint = 0;//获取修改后目标的指针
        for (int i = 0;i<nums.length;i++){//慢指针
            for (int j = i ;j<nums.length;j++){//快指针

            }

        }
        for (int i = 0;i<nums.length-1;i++){

            while (i != newValuePoint){

            }

        }
        for (int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        return result;

    }


    /**
     * 给定一个整数类型的数组?nums，请编写一个能够返回数组 “中心索引” 的方法。
     * 我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
     * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
     * 示例 1：
     * 输入：
     * nums = [1, 7, 3, 6, 5, 6]
     * 输出：3
     * 解释：
     * 索引 3 (nums[3] = 6) 的左侧数之和 (1 + 7 + 3 = 11)，与右侧数之和 (5 + 6 = 11) 相等。
     * 同时, 3 也是第一个符合要求的中心索引。
     * 示例 2：
     * 输入：
     * nums = [1, 2, 3]
     * 输出：-1
     * 解释：
     * 数组中不存在满足此条件的中心索引。
     * 说明：
     * nums 的长度范围为?[0, 10000]。
     * 任何一个?nums[i] 将会是一个范围在?[-1000, 1000]的整数。
     * 通过次数47,693提交次数126,987
     * @param nums
     * @return
     */
    public static int pivotIndex(int[] nums) {

        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int i =0;i<nums.length;i++){
            sum = sum +nums[i];
        }

        for (int i = 0;i<nums.length;i++){
            if (i != 0){
                leftSum = leftSum + nums[i-1];
            }
            if (i != nums.length-1){
                rightSum = sum - leftSum - nums[i];
            }else {
                rightSum = 0;
            }

            if (leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //int res = removeDuplicates(new int[]{1,1,2});
        //int res2 = removeDuplicates(new int[]{0,1,1,1,1,2,2,3,3,4});
        System.out.println(pivotIndex(new int[]{-1,-1,0,1,1,0}));
    }
}
