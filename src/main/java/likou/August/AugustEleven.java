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
     * 希尔排序
     * @param numbs
     * @return
     */
    private static int[] sort(int[] numbs) {
        //增量d
        int d = numbs.length/2;

        while (d >= 1){
            //对子数组进行插入排序
            //遍历子数组
            int subNum = 0;
            while (subNum + d < numbs.length){
                //对下标从subNum开始的子数组进行插入排序
                for (int i= subNum;i<numbs.length;i+=d){
                    int tar = i;
                    //比较大小，找到最小值
                    for (int j = i-d ;j>=subNum;j-=d){
                        //如果目标值比当前值小交换位置
                        if (numbs[tar] <= numbs[j]){
                            //将最小值min和当前位置进行交换j
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
        //选择排序
        sort(numb);
        for (int i = 0;i<numb.length;i++){
            System.out.println(numb[i]);
        }
    }
}
