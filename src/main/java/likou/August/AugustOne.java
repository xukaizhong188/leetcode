package likou.August;

/**
 * AugustOne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustOne {
    /**
     * ���������ַ�����ʽ�ķǸ�����?num1 ��num2?���������ǵĺ͡�
     * ע�⣺
     * num1 ��num2?�ĳ��ȶ�С�� 5100.
     * num1 ��num2 ��ֻ��������?0-9.
     * num1 ��num2 ���������κ�ǰ���㡣
     * �㲻��ʹ���κ΃Ƚ� BigInteger �⣬?Ҳ����ֱ�ӽ�������ַ���ת��Ϊ������ʽ��
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
