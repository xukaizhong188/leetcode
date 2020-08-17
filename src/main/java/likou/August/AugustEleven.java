package likou.August;

/**
 * AugustTne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustEleven {
    private static int[]  numb2;
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

    /**
     * ԭ�ع鲢�������ڲ�ʹ�ö���Ŀռ������½�numb��������
     * @param numb  ԭ����:����lo��midΪ��һ���������飬mid+1��hiΪ�ڶ�����������
     * @param lo
     * @param mid
     * @param hi
     * @return
     */
    private static int[] merge(int[] numb, int lo, int mid, int hi) {
        int i = lo;
        int j = mid+1;
        //��������

        for (int k = 0 ;k<numb.length;k++){
            numb2[k] = numb[k];
        }
        for (int k = lo; k<numb.length;k++){

            if (i > mid){
                numb[k] = numb2[j++];
            }else if (j >=numb.length){
                numb[k] = numb2[i++];
            }else if (numb2[j] < numb2[i] ){
                numb[k] = numb2[j++];
            }else {
                numb[k] = numb2[i++];
            }
        }
        return numb;
    }

    /**
     * �Զ����µĹ鲢������ԭ�ع鲢�Ļ�����ͨ���ݹ���ɹ鲢����
     * @param numb
     * @param lo
     * @param hi
     * @return
     */
    private static void sort(int[] numb, int lo, int hi) {

        if (hi <= lo){
            return ;
        }
        int mid = (lo + hi) / 2;
        sort(numb,lo,mid);
        sort(numb,mid+1,hi);
        merge(numb,lo,mid,hi);
    }



    public static void main(String[] args) {
        int[] numb =  new int[100];
        for (int i = 0;i<numb.length;i++){
            numb[i] = (int) (Math.random()*(100));
        }
        for (int i = 0;i<numb.length;i++){
            System.out.println(numb[i]);
        }
        System.out.println("----------------------------");
        //sort(numb,0,numb.length - 1);
        //ѡ������
        sort(numb);
        for (int i = 0;i<numb.length;i++){
            System.out.println(numb[i]);
        }
    }
}
