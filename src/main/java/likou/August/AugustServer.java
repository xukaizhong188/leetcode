package likou.August;

/**
 * AugustOne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustServer {


    /**
     * ¶ş·Ö²éÕÒ
     * @param nums
     * @param s
     * @return
     */
    public static int rank(int[] nums, int s) {

        int lo = 0;
        int hi = nums.length-1;
        while (lo <= hi){
            int mid = (lo + hi) / 2;
            if (s == nums[mid]){
                return mid;
            }
            if (s < nums[mid]){
                hi = mid-1;
            }
            if (s > nums[mid]){
                lo = mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
