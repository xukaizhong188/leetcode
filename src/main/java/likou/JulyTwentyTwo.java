package likou;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyTwentyTwo {

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如，数组?[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。??
     * 示例 1：
     * 输入：[3,4,5,1,2]
     * 输出：1
     * 示例 2：
     * 输入：[2,2,2,0,1]
     * 输出：0
     * @param numbers
     * @return
     */
    public static int minArray(int[] numbers) {

        int min = numbers[0];
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i] < min){
                return numbers[i];
            }
        }
        return min;
    }

    /**
     * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     * ( 例如，数组?[0,1,2,4,5,6,7] 可能变为?[4,5,6,7,0,1,2]?)。
     * 请找出其中最小的元素。
     * 注意数组中可能存在重复的元素。
     * 示例 1：
     * 输入: [1,3,5]
     * 输出: 1
     * 示例?2：
     * 输入: [2,2,2,0,1]
     * 输出: 0
     * 说明：
     * 这道题是?寻找旋转排序数组中的最小值?的延伸题目。
     * 允许重复会影响算法的时间复杂度吗？会如何影响，为什么？
     *
     * @param nums
     * @return
     */
    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 0;i<nums.length;i++){
            if (nums[i] < min){
                return nums[i];
            }
        }
        return min;
    }


    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 你可以假设数组中无重复元素。
     * 示例 1:
     * 输入: [1,3,5,6], 5
     * 输出: 2
     * 示例?2:
     * 输入: [1,3,5,6], 2
     * 输出: 1
     * 示例 3:
     * 输入: [1,3,5,6], 7
     * 输出: 4
     * 示例 4:
     * 输入: [1,3,5,6], 0
     * 输出: 0
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        //二分查
        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int point = (left+right)/2;
            if (nums[point] == target){
                return point;
            }
            if (nums[point] < target){
                left = point+1;
            }
            if (nums[point] > target){
                right = point-1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},0));
    }
}
