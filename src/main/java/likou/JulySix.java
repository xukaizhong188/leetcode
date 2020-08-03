package likou;

import java.util.ArrayList;
import java.util.List;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulySix {
    /**
     * ����һ������?n�������æ���㲢���ظ���������λ����֮�����롸��λ����֮�͡��Ĳ
     * ʾ�� 1��
     * ���룺n = 234
     * �����15
     * ���ͣ�
     * ��λ��֮�� = 2 * 3 * 4 = 24
     * ��λ��֮�� = 2 + 3 + 4 = 9
     * ��� = 24 - 9 = 15
     * ʾ�� 2��
     * ���룺n = 4421
     * �����21
     * ���ͣ�
     * ��λ��֮�� = 4 * 4 * 2 * 1 = 32
     * ��λ��֮�� = 4 + 4 + 2 + 1 = 11
     * ��� = 32 - 11 = 21
     * ?
     *
     * ��ʾ��
     *
     * 1 <= n <= 10^5
     *
     * @param n
     * @return
     */
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int gewei = 0;

        while(n > 0){
            gewei = n % 10;
            n = n / 10;
            product = product * gewei;
            sum = sum + gewei;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
}
