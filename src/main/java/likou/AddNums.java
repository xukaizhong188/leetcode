package likou;

/**
 * AddNums
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AddNums {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            if ( i == 0){
                result[i] = nums[i];
            }else {
                result[i] = nums[i] + result[i-1];
            }
        }
        return result;
    }
    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];

        for (int i = 0;i<n;i++){
            nums[i] = start + 2 * i;
        }
        int result = 0 ;
        for (int i = 0;i<n;i++){
            if ( i == 0){
                result = nums[i];
            }else {
                result = result ^ nums[i];
            }


        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
    }
}
