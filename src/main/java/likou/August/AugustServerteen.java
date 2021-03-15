package likou.August;

/**
 * AugustTne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustServerteen {

    /**
     * 归并排序
     * @param numb
     * @param lo
     * @param hi
     */
    private static void sort(int[] numb, int lo, int hi) {
        if (lo >= hi){
            return;
        }

        //思考1改进,判断是小数组直接进行插入排序，
        if (hi - lo <= 8){
            addSort(numb,lo,hi);
        }
        //找到临界值所在的索引
        int j = qifen(numb,lo,hi);
        sort(numb,lo,j-1);//对子数组左半部分进行排序
        sort(numb,j+1,hi);//对子数组右半边进行排序
    }

    /**
     * 切分算法找到临界值的索引
     * @param numb
     * @param lo
     * @param hi
     * @return
     */
    private static int qifen(int[] numb, int lo, int hi) {
        //定义左右两个指针
        int i = lo;
        int j = hi+1;
        //将numb[lo]作为临界值
        int tar = numb[lo];
        while (true){
            //注意++i的使用，所以在初始化的时候 i取lo,j取hi+1
            //找到左侧第一个大于tar的元素
            while (less(numb[++i],tar)){
                if (i == hi){
                    break;
                }
            }
            //找到右侧第一个小于tar的元素
            while (less(tar,numb[--j])) {
                if (j == lo){
                    break;
                }
            }
            //当两个指针相遇返回
            if (i >= j){
                break;
            }
            //交换i和j的两个元素
            exchange(numb,i,j);
        }
        //交换tar到目标位置
        exchange(numb,lo,j);
        return j;
    }

    /**
     * 对ah和b进行比较，如果a小于b则返回true反之返回false
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
     * 将数组numb中的ayu元素和b元素进行位置交换
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
     * 插入排序
     * @param numbs
     * @return
     */
    private static void addSort(int[] numbs,int lo,int hi) {

        int n = hi-lo+1;
        for (int i = lo;i<n;i++){
            int tar = i;
            //比较大小，找到最小值
            for (int j = i-1 ;j>lo;j--){
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
        //选择排序
        //sort(numb);
        for (int i = 0;i<numb.length;i++){
            System.out.println(numb[i]);
        }
    }
}
