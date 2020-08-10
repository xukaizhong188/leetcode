package likou.August;

/**
 * AugustTne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustTen {
    /**
     * 选择排序
     * @param numbs
     * @return
     */
    private static int[] sort(int[] numbs) {
        for (int i = 0;i<numbs.length;i++){
            int min =i;
            //比较大小，找到最小值
            for (int j = i+1 ;j<numbs.length;j++){

                if (numbs[min] >= numbs[j]){
                    min = j;
                }
            }
            //将最小值min和当前位置进行交换
            int tem = numbs[i];
            numbs[i] = numbs[min];
            numbs[min] = tem;

        }
        return numbs;
    }


    public static void main(String[] args) {
        int[] a = sort(new int[]{1,3,2,54,53,1,342,35,675,89,9,23});

        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
