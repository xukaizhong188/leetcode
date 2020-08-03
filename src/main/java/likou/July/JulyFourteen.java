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
     * ����һ������Ϊ?n?���������飬�����ж��� ��� �ı�?1 ��Ԫ�ص�����£��������ܷ���һ���ǵݼ����С�
     * ��������������һ���ǵݼ����еģ�?�������������е�?i (0 <= i <= n-2)�������� nums[i] <= nums[i + 1]��
     * ʾ�� 1:
     * ����: nums = [4,2,3]
     * ���: true
     * ����: �����ͨ���ѵ�һ��4���1��ʹ������Ϊһ���ǵݼ����С�
     * ʾ�� 2:
     * ����: nums = [4,2,1]
     * ���: false
     * ����: �㲻����ֻ�ı�һ��Ԫ�ص�����½����Ϊ�ǵݼ����С�
     * ˵����
     * 1 <= n <= 10 ^ 4
     * - 10 ^ 5?<= nums[i] <= 10 ^ 5
     * @param nums
     * @return
     */
    public static boolean checkPossibility(int[] nums) {
        //�����ⷨ:���������бȽϣ�����Ƚϼ�����Ƚϣ�ע�⣺�ƶ�һ��Ԫ�ؿ����ƶ�������Ҳ�����ƶ�С��
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
