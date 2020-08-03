package likou;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyTwentyTwo {

    /**
     * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת������һ����������������һ����ת�������ת�������СԪ�ء�
     * ���磬����?[3,4,5,1,2] Ϊ [1,2,3,4,5] ��һ����ת�����������СֵΪ1��??
     * ʾ�� 1��
     * ���룺[3,4,5,1,2]
     * �����1
     * ʾ�� 2��
     * ���룺[2,2,2,0,1]
     * �����0
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
     * ���谴�����������������Ԥ��δ֪��ĳ�����Ͻ�������ת��
     * ( ���磬����?[0,1,2,4,5,6,7] ���ܱ�Ϊ?[4,5,6,7,0,1,2]?)��
     * ���ҳ�������С��Ԫ�ء�
     * ע�������п��ܴ����ظ���Ԫ�ء�
     * ʾ�� 1��
     * ����: [1,3,5]
     * ���: 1
     * ʾ��?2��
     * ����: [2,2,2,0,1]
     * ���: 0
     * ˵����
     * �������?Ѱ����ת���������е���Сֵ?��������Ŀ��
     * �����ظ���Ӱ���㷨��ʱ�临�Ӷ��𣿻����Ӱ�죬Ϊʲô��
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
     * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
     * ����Լ������������ظ�Ԫ�ء�
     * ʾ�� 1:
     * ����: [1,3,5,6], 5
     * ���: 2
     * ʾ��?2:
     * ����: [1,3,5,6], 2
     * ���: 1
     * ʾ�� 3:
     * ����: [1,3,5,6], 7
     * ���: 4
     * ʾ�� 4:
     * ����: [1,3,5,6], 0
     * ���: 0
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        //���ֲ�
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
