package likou.August;

/**
 * AugustOne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustOne {
    /**
     * 给定两个字符串形式的非负整数?num1 和num2?，计算它们的和。
     * 注意：
     * num1 和num2?的长度都小于 5100.
     * num1 和num2 都只包含数字?0-9.
     * num1 和num2 都不包含任何前导零。
     * 你不能使用任何內建 BigInteger 库，?也不能直接将输入的字符串转换为整数形式。
     * @param num1
     * @param num2
     * @return
     */
    public static String addStrings(String num1, String num2) {
        char[] num1str = num1.toCharArray();
        char[] num2str = num2.toCharArray();
        StringBuilder stringBuffer = new StringBuilder("");
        boolean jinwei = false;
        int i = num1str.length-1;
        int j = num2str.length-1;
        int a = 0;
        int first = 0;
        int second = 0;
        while (i >= 0 || j>=0 || jinwei){
            if (i < 0){
                first = 0;
            }else {
                first =(int)num1str[i] - (int)('0');
            }
            if (j < 0){
                second = 0;
            }else {
                second = (int)num2str[j] - (int)('0');
            }

            if (jinwei){
                a = first + second +1;
            }else {
                a = first + second;
            }
            if (a >= 10){
                stringBuffer.append(a % 10);
                jinwei = true;
            }else {
                stringBuffer.append(a);
                jinwei = false;
            }
            i--;
            j--;
        }


        return stringBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("9","99"));
    }
}
