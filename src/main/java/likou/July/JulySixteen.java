package likou.July;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulySixteen {
    /**
     * 给定两个数组，编写一个函数来计算它们的交集。
     * 示例 1：
     * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出：[2,2]
     * 示例 2:
     * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出：[4,9]
     * 说明：
     * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
     * 我们可以不考虑输出结果的顺序。
     * 进阶：
     * 如果给定的数组已经排好序呢？你将如何优化你的算法？
     * 如果?nums1?的大小比?nums2?小很多，哪种方法更优？
     * 如果?nums2?的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {

        int[] mapNum = nums1.length>=nums2.length?nums1:nums2;
        int[] seleNum = nums1.length<nums2.length?nums1:nums2;
        int num = 0;
        //将个数少的数组转化为map,key为值，value为个数
        Map<Integer,Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0;i<mapNum.length;i++){
            if (numMap.containsKey(mapNum[i])){
                num = numMap.get(mapNum[i]);
            }
            numMap.put(mapNum[i],++num);
            num = 0;
        }

        List<Integer> result = new ArrayList<Integer>();
        //遍历另一个数组，
        for (int i= 0;i<seleNum.length;i++){
            //交集数
            if (numMap.containsKey(seleNum[i]) && numMap.get(seleNum[i]) != 0){
                result.add(seleNum[i]);
                numMap.put(seleNum[i],0);
            }
        }
        int[] resultNum = new int[result.size()];
        for (int i = 0; i<result.size();i++){
            resultNum[i] = result.get(i);
        }
        return resultNum;
    }

    public static void main(String[] args) {
        int[] res = intersect(new int[]{1,2},new int[]{1,1});
        for (int i = 0;i<res.length;i++){
            System.out.println(res[i]);

        }
    }
}
