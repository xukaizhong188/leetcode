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
     * ����һ���Ѱ�����������?���������飬�ҵ�������ʹ���������֮�͵���Ŀ������
     * ����Ӧ�÷����������±�ֵ index1 �� index2������ index1?����С��?index2��
     * ˵��:
     * ���ص��±�ֵ��index1 �� index2�����Ǵ��㿪ʼ�ġ�
     * ����Լ���ÿ������ֻ��ӦΨһ�Ĵ𰸣������㲻�����ظ�ʹ����ͬ��Ԫ�ء�
     * ʾ��:
     * ����: numbers = [2, 7, 11, 15], target = 9
     * ���: [1,2]
     * ����: 2 �� 7 ֮�͵���Ŀ���� 9 ����� index1 = 1, index2 = 2 ��
     * ͨ������120,604�ύ����216,472
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
     * ˫ָ�뷽��
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
