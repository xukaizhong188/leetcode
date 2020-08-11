package likou.August;

/**
 * AugustTne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustEleven {
    /**
     * ϣ������
     * @param numbs
     * @return
     */
    private static int[] sort(int[] numbs) {
        //����d
        int d = numbs.length/2;

        while (d >= 1){
            //����������в�������
            //����������
            int subNum = 0;
            while (subNum + d < numbs.length){
                //���±��subNum��ʼ����������в�������
                for (int i= subNum;i<numbs.length;i+=d){
                    int tar = i;
                    //�Ƚϴ�С���ҵ���Сֵ
                    for (int j = i-d ;j>=subNum;j-=d){
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
                subNum++;
            }
            d = d / 2;
        }

        return numbs;
    }


    public static void main(String[] args) {
        int[] a = sort(new int[]{1,3,2,54,53,1,342,35,675,89,9,23});
        //int[] a = sort(new int[]{1,6,2,5,4,3});

        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
