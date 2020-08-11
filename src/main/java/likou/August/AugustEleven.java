package likou.August;

/**
 * AugustTne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustEleven {
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


    public static void main(String[] args) {
        int[] a = sort(new int[]{1,3,2,54,53,1,342,35,675,89,9,23});
        //int[] a = sort(new int[]{1,6,2,5,4,3});

        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
