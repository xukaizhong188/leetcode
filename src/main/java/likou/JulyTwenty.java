package likou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyTwenty {
    /**
     * 给定一个已按照升序排列?的有序数组，找到两个数使得它们相加之和等于目标数。
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1?必须小于?index2。
     * 说明:
     * 返回的下标值（index1 和 index2）不是从零开始的。
     * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
     * 示例:
     * 输入: numbers = [2, 7, 11, 15], target = 9
     * 输出: [1,2]
     * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
     * 通过次数120,604提交次数216,472
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
        for (int i = 0;i<numbers.length;i++){
            numbersMap.put(numbers[i],i);
        }
        int tar = 0;
        for (int i = 0;i<numbers.length;i++){
            tar = target - numbers[i];
            if (numbersMap.containsKey(tar)){
                result[0] = i+1;
                result[1] = numbersMap.get(tar)+1;
                break;
            }
        }
        return result;
    }

    /**
     * 双指针方法
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];

        int firt = 0;
        int second = numbers.length-1;
        int sum = 0;
        while (firt != second){
            sum = numbers[firt] + numbers[second];
            if (sum >target){
                second--;
            }else if (sum < target){
                firt++;
            }else {
                result[0] = firt+1;
                result[1] = second+1;
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] res = twoSum2(new int[]{2,7,11,15},9);
        for (int i = 0;i<res.length;i++){
            System.out.println(res[i]);

        }
    }
}
