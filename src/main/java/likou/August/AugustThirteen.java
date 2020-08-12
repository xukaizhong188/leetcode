package likou.August;

/**
 * AugustTne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustThirteen {
    private static int[]  numb2;
    /**
     * 原地归并方法（在不使用额外的空间的情况下将numb进行排序）
     * @param numb  原数组:其中lo到mid为第一个有序数组，mid+1到hi为第二个有序数组
     * @param lo
     * @param mid
     * @param hi
     * @return
     */
    private static int[] merge(int[] numb, int lo, int mid, int hi) {
        int i = lo;
        int j = mid+1;
        //遍历数据

        for (int k = 0 ;k<numb.length;k++){
            numb2[k] = numb[k];
        }
        for (int k = lo; k<numb.length;k++){

            if (i > mid){
                numb[k] = numb2[j++];
            }else if (j > hi){
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
     * 自顶向下的归并排序：在原地归并的基础上通过递归完成归并排序
     * @param numb
     * @param lo
     * @param hi
     * @return
     */
    private static void sort(int[] numb, int lo, int hi) {

        if (hi <= lo){
            return ;
        }
        int mid = lo+(hi - lo) / 2;
        sort(numb,lo,mid);//对左半边进行排序
        sort(numb,mid+1,hi);//对右半边进行排序
        //思考2改进：如果num[mid] <= num[mid+1]跳过merge
        if (numb[mid] > numb[mid+1]){
            merge(numb,lo,mid,hi);//原地归并处理
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
        numb2 = new int[numb.length];
        sort(numb,0,numb.length - 1);
        for (int i = 0;i<numb.length;i++){
            System.out.println(numb[i]);
        }
    }
}
