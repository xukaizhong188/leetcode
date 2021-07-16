package likou.August;

/**
 * AugustOne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustOne2 {

    /**
     * дһ������ StrToInt��ʵ�ְ��ַ���ת��������������ܡ�����ʹ�� atoi �����������ƵĿ⺯����
     * ���ȣ��ú����������Ҫ�������õĿ�ͷ�ո��ַ���ֱ��Ѱ�ҵ���һ���ǿո���ַ�Ϊֹ��
     * ������Ѱ�ҵ��ĵ�һ���ǿ��ַ�Ϊ�����߸���ʱ���򽫸÷�����֮���澡���ܶ���������������������Ϊ�������������ţ������һ���ǿ��ַ������֣���ֱ�ӽ�����֮�������������ַ�����������γ�������
     * ���ַ���������Ч����������֮��Ҳ���ܻ���ڶ�����ַ�����Щ�ַ����Ա����ԣ����Ƕ��ں�����Ӧ�����Ӱ�졣
     * ע�⣺������ַ����еĵ�һ���ǿո��ַ�����һ����Ч�����ַ����ַ���Ϊ�ջ��ַ����������հ��ַ�ʱ������ĺ�������Ҫ����ת����
     * ���κ�����£����������ܽ�����Ч��ת��ʱ���뷵�� 0��
     * ˵����
     * �������ǵĻ���ֻ�ܴ洢 32 λ��С���з�����������ô����ֵ��ΧΪ?[?231,? 231?? 1]�������ֵ���������Χ���뷵�� ?INT_MAX (231?? 1) ��?INT_MIN (?231) ��
     * ʾ��?1:
     * ����: "42"
     * ���: 42
     * ʾ��?2:
     * ����: "   -42"
     * ���: -42
     * ����: ��һ���ǿհ��ַ�Ϊ '-', ����һ�����š�
     * ?    ���Ǿ����ܽ���������������������ֵ�����������������õ� -42 ��
     * ʾ��?3:
     * ����: "4193 with words"
     * ���: 4193
     * ����: ת����ֹ������ '3' ����Ϊ������һ���ַ���Ϊ���֡�
     * ʾ��?4:
     * ����: "words and 987"
     * ���: 0
     * ����: ��һ���ǿ��ַ��� 'w', �����������ֻ��������š�
     *      ����޷�ִ����Ч��ת����
     * ʾ��?5:
     * ����: "-91283472332"
     * ���: -2147483648
     * ����: ���� "-91283472332" ���� 32 λ�з���������Χ��
     * ?    ��˷��� INT_MIN (?231) ��
     * @param str
     * @return
     */
    public static int strToInt2(String str) {
        if (null == str){
            return 0;
        }
        if (str.length() == 0){
            return 0;
        }
        char[] strchar = str.trim().toCharArray();
        //�����Ƿ���Ч
        int flag = 0;
        int result = 0;
        for (int i = 0 ; i< strchar.length;i++){
            if ('-' == strchar[i] && flag == 0 ){
                flag = -1;
                continue;
            }
            if ('+' == strchar[i] && flag == 0){
                flag = 1;
                continue;
            }
            if ('.' == strchar[i] && flag == 0){
                return 0;
            }
            //��һ���ǿ��ַ���Ϊ�ַ�����0
            if ((Character.isLowerCase(strchar[i]) || Character.isUpperCase(strchar[i]))  && flag == 0){
                return 0;
            }

            if (flag == 0){
                flag = 1;
            }
            if (result != 0 && '.'== strchar[i] ){
                break;
            }

            if (Character.isDigit(strchar[i])){
                int target =  ((int)strchar[i]-(int)'0');

                if ((result > (Integer.MAX_VALUE - target) / 10)){
                    if (flag > 0){
                        return Integer.MAX_VALUE;
                    }else {
                        return Integer.MIN_VALUE;
                    }
                }
                if (result == 0){
                    result = result + target;
                }else {
                    result = result * 10 + target;
                }

            }
        }

        if (flag > 0){
            return result;
        }else {
            return -result;
        }



    }

    public static void main(String[] args) {
        System.out.println(strToInt2("+-2"));
        System.out.println(strToInt2("+"));
        System.out.println(strToInt2(""));
        System.out.println(strToInt2(".1"));
        System.out.println(strToInt2("3.14159"));
    }
}
