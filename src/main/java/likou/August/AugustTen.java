package likou.August;

/**
 * AugustTne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustTen {
    /**
     * ѡ������
     * @param numbs
     * @return
     */
    private static int[] sort(int[] numbs) {
        for (int i = 0;i<numbs.length;i++){
            int min =i;
            //�Ƚϴ�С���ҵ���Сֵ
            for (int j = i+1 ;j<numbs.length;j++){

                if (numbs[min] >= numbs[j]){
                    min = j;
                }
            }
            //����Сֵmin�͵�ǰλ�ý��н���
            int tem = numbs[i];
            numbs[i] = numbs[min];
            numbs[min] = tem;

        }
        return numbs;
    }

    /**
     * ��������
     * @param numbs
     * @return
     */
    private static int[] sort2(int[] numbs) {
        for (int i = 0;i<numbs.length;i++){
            int tar = i;
            //�Ƚϴ�С���ҵ���Сֵ
            for (int j = i-1 ;j>0;j--){
                //���Ŀ��ֵ�ȵ�ǰֵС����λ��
                if (numbs[tar] <= numbs[j]){
                    //����Сֵmin�͵�ǰλ�ý��н���j
                    int tem = numbs[tar];
                    numbs[tar] = numbs[j];
                    numbs[j] = tem;
                }else {
                    break;
                }
                tar = j;
            }
        }
        return numbs;
    }


    public static void main(String[] args) {
        int[] a = sort2(new int[]{1,3,2,54,53,1,342,35,675,89,9,23});

        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
