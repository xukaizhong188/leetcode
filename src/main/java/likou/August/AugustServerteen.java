package likou.August;

/**
 * AugustTne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustServerteen {

    /**
     * �鲢����
     * @param numb
     * @param lo
     * @param hi
     */
    private static void sort(int[] numb, int lo, int hi) {
        if (lo >= hi){
            return;
        }

        //˼��1�Ľ�,�ж���С����ֱ�ӽ��в�������
        if (hi - lo <= 8){
            addSort(numb,lo,hi);
        }
        //�ҵ��ٽ�ֵ���ڵ�����
        int j = qifen(numb,lo,hi);
        sort(numb,lo,j-1);//����������벿�ֽ�������
        sort(numb,j+1,hi);//���������Ұ�߽�������
    }

    /**
     * �з��㷨�ҵ��ٽ�ֵ������
     * @param numb
     * @param lo
     * @param hi
     * @return
     */
    private static int qifen(int[] numb, int lo, int hi) {
        //������������ָ��
        int i = lo;
        int j = hi+1;
        //��numb[lo]��Ϊ�ٽ�ֵ
        int tar = numb[lo];
        while (true){
            //ע��++i��ʹ�ã������ڳ�ʼ����ʱ�� iȡlo,jȡhi+1
            //�ҵ�����һ������tar��Ԫ��
            while (less(numb[++i],tar)){
                if (i == hi){
                    break;
                }
            }
            //�ҵ��Ҳ��һ��С��tar��Ԫ��
            while (less(tar,numb[--j])) {
                if (j == lo){
                    break;
                }
            }
            //������ָ����������
            if (i >= j){
                break;
            }
            //����i��j������Ԫ��
            exchange(numb,i,j);
        }
        //����tar��Ŀ��λ��
        exchange(numb,lo,j);
        return j;
    }

    /**
     * ��ah��b���бȽϣ����aС��b�򷵻�true��֮����false
     * @param a
     * @param b
     * @return
     */
    private static boolean less(int a, int b) {
        if (a < b){
            return true;
        }else {
            return false;
        }
    }

    /**
     * ������numb�е�ayuԪ�غ�bԪ�ؽ���λ�ý���
     * @param numb
     * @param a
     * @param b
     */
    private static void exchange(int[] numb, int a, int b) {
        int temp = numb[a];
        numb[a] = numb[b];
        numb[b] = temp;
    }
    /**
     * ��������
     * @param numbs
     * @return
     */
    private static void addSort(int[] numbs,int lo,int hi) {

        int n = hi-lo+1;
        for (int i = lo;i<n;i++){
            int tar = i;
            //�Ƚϴ�С���ҵ���Сֵ
            for (int j = i-1 ;j>lo;j--){
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
        sort(numb,0,numb.length - 1);
        //ѡ������
        //sort(numb);
        for (int i = 0;i<numb.length;i++){
            System.out.println(numb[i]);
        }
    }
}
