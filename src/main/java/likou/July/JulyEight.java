package likou.July;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyEight {
    /**
     * ������ʹ��һ��ľ�彨����ˮ�塣���������͵�ľ�壬���г��Ƚ϶̵�ľ�峤��Ϊshorter��
     * ���Ƚϳ���ľ�峤��Ϊlonger�����������ʹ��k��ľ�塣��дһ��������������ˮ�����п��ܵĳ��ȡ�
     * ���صĳ�����Ҫ��С�������С�
     * ʾ����
     * ���룺
     * shorter = 1
     * longer = 2
     * k = 3
     * �����{3,4,5,6}
     * ��ʾ��
     * 0 < shorter <= longer
     * 0 <= k <= 100000
     *
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public static int[] divingBoard(int shorter, int longer, int k) {
        return null;
    }

    /**
     * ����һ���Ǹ�����?num?�����㷵�ؽ������ 0 ����Ҫ�Ĳ����� �����ǰ������ż��������Ҫ�������� 2 �����򣬼�ȥ 1 ��
     * ʾ�� 1��
     * ���룺num = 14
     * �����6
     * ���ͣ�
     * ���� 1) 14 ��ż�������� 2 �õ� 7 ��
     * ���� 2�� 7 ���������� 1 �õ� 6 ��
     * ���� 3�� 6 ��ż�������� 2 �õ� 3 ��
     * ���� 4�� 3 ���������� 1 �õ� 2 ��
     * ���� 5�� 2 ��ż�������� 2 �õ� 1 ��
     * ���� 6�� 1 ���������� 1 �õ� 0 ��
     * ʾ�� 2��
     * ���룺num = 8
     * �����4
     * ���ͣ�
     * ���� 1�� 8 ��ż�������� 2 �õ� 4 ��
     * ���� 2�� 4 ��ż�������� 2 �õ� 2 ��
     * ���� 3�� 2 ��ż�������� 2 �õ� 1 ��
     * ���� 4�� 1 ���������� 1 �õ� 0 ��
     * ʾ�� 3��
     * ���룺num = 123
     * �����12
     * ��ʾ��
     * 0 <= num <= 10^6
     * @param num
     * @return
     */
    public static int numberOfSteps(int num) {
        int result = 0;
        while (num != 0){
            if(num % 2 == 0){
                num = num / 2;
            }else {
                num = num -1;
            }
            result++;
            System.out.println(num);
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        //System.out.println(divingBoard(1,2,3));
    }
}