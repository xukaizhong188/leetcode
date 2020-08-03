package likou.July;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyTwentyEight {

    /**
     * ����������Сд��ĸ���ɵ��ַ���?A?��?B?��ֻҪ���ǿ���ͨ������ A �е�������ĸ�õ��� B ��ȵĽ����
     * �ͷ���?true?�����򷵻� false ��
     * ʾ�� 1��
     * ���룺 A = "ab", B = "ba"
     * ����� true
     * ʾ�� 2��
     * ���룺 A = "ab", B = "ab"
     * ����� false
     * ʾ�� 3:
     * ���룺 A = "aa", B = "aa"
     * ����� true
     * ʾ�� 4��
     * ���룺 A = "aaaaaaabc", B = "aaaaaaacb"
     * ����� true
     * ʾ�� 5��
     * ���룺 A = "", B = "aa"
     * ����� false
     * ��ʾ��
     * 0 <= A.length <= 20000
     * 0 <= B.length <= 20000
     * A?��?B?����Сд��ĸ���ɡ�
     * @param A
     * @param B
     * @return
     */
    public boolean buddyStrings(String A, String B) {

        if (A.length() != B.length()){
            return false;
        }
        int n = A.length();
        int count = 0;
        for (int i = 0;i<n;i++){
            if (A.substring(i-1,i).equals(B.substring(i-1,i))){
                count++;
            }
        }
        if (count!=2){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(buddyStrings);
    }
}
