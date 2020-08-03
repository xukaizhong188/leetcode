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
     * ����һ���������飬����Ҫ�� ԭ�� ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
     *      ��Ҫʹ�ö��������ռ䣬������� ԭ�� �޸��������� ����ʹ�� O(1) ����ռ����������ɡ�
     *      ʾ�� 1:
     *      �������� nums = [1,1,2],
     *      ����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2��
     *      �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
     *      ʾ�� 2:
     *      ���� nums = [0,0,1,1,1,2,2,3,3,4],
     *      ����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��
     *      �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
     *      ˵��:
     *      Ϊʲô������ֵ��������������Ĵ���������?
     *      ��ע�⣬�����������ԡ����á���ʽ���ݵģ�����ζ���ں������޸�����������ڵ������ǿɼ��ġ�
     *      ����������ڲ���������:
     *      // nums ���ԡ����á���ʽ���ݵġ�Ҳ����˵������ʵ�����κο���
     *      int len = removeDuplicates(nums);
     *      // �ں������޸�����������ڵ������ǿɼ��ġ�
     *      // ������ĺ������صĳ���, �����ӡ�������иó��ȷ�Χ�ڵ�����Ԫ�ء�
     *      for (int i = 0; i < len; i++) {
     *      print(nums[i]);
     *      }
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int result =0;
        int point = 0;//��Ҫ�ı�ֵ������ָ��
        int newValuePoint = 0;//��ȡ�޸ĺ�Ŀ���ָ��
        for (int i = 0;i<nums.length;i++){//��ָ��
            for (int j = i ;j<nums.length;j++){//��ָ��

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
     * ����һ���������͵�����?nums�����дһ���ܹ��������� ������������ �ķ�����
     * ������������������ �������� �ģ����������������������Ԫ����ӵĺ͵����Ҳ�����Ԫ����ӵĺ͡�
     * ������鲻����������������ô����Ӧ�÷��� -1����������ж��������������ô����Ӧ�÷��������ߵ���һ����
     * ʾ�� 1��
     * ���룺
     * nums = [1, 7, 3, 6, 5, 6]
     * �����3
     * ���ͣ�
     * ���� 3 (nums[3] = 6) �������֮�� (1 + 7 + 3 = 11)�����Ҳ���֮�� (5 + 6 = 11) ��ȡ�
     * ͬʱ, 3 Ҳ�ǵ�һ������Ҫ�������������
     * ʾ�� 2��
     * ���룺
     * nums = [1, 2, 3]
     * �����-1
     * ���ͣ�
     * �����в��������������������������
     * ˵����
     * nums �ĳ��ȷ�ΧΪ?[0, 10000]��
     * �κ�һ��?nums[i] ������һ����Χ��?[-1000, 1000]��������
     * ͨ������47,693�ύ����126,987
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
