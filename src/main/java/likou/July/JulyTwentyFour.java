package likou.July;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyTwentyFour {
    /**
     * ����һ������ļ��ϣ���ϲ������ص������䡣
     * ʾ�� 1:
     * ����: [[1,3],[2,6],[8,10],[15,18]]
     * ���: [[1,6],[8,10],[15,18]]
     * ����: ���� [1,3] �� [2,6] �ص�, �����Ǻϲ�Ϊ [1,6].
     * ʾ��?2:
     * ����: [[1,4],[4,5]]
     * ���: [[1,5]]
     * ����: ���� [1,4] �� [4,5] �ɱ���Ϊ�ص����䡣
     * ͨ������119,320�ύ����279,494
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        int[][] reslut = new int[intervals.length][2];
        int [] nowIntervals = intervals[0];

        for (int i = 0; i< intervals[0].length ;i++){

        }
        return null;
    }

    /**
     * ����˿�ͱ���һ������Ϸ�����������ж�������˿���ֿ��֡�
     * ������ڰ�����һ������?N?����ÿ����ҵĻغϣ������Ҫִ�����²�����
     * ѡ����һ?x������?0 < x < N ��?N % x == 0?��
     * �� N - x?�滻�ڰ��ϵ����� N ��
     * �������޷�ִ����Щ�������ͻ������Ϸ��
     * ֻ���ڰ���˿����Ϸ��ȡ��ʤ��ʱ�ŷ���?True�����򷵻� false������������Ҷ������״̬������Ϸ��
     * ʾ�� 1��
     * ���룺2
     * �����true
     * ���ͣ�����˿ѡ�� 1�������޷����в�����
     * ʾ�� 2��
     * ���룺3
     * �����false
     * ���ͣ�����˿ѡ�� 1������Ҳѡ�� 1��Ȼ����˿�޷����в�����
     * ��ʾ��
     * 1 <= N <= 1000
     * ͨ������30,702�ύ����44,170
     * @param N
     * @return
     */
    public static boolean divisorGame(int N) {

        return false;
    }


    public static void main(String[] args) {
        System.out.println(divisorGame(4));
    }
}
