package likou.August;

/**
 * AugustOne
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class AugustFive {

    /**
     * ��֤�������ַ����Ƿ���Խ���Ϊʮ�������֡�
     * ����:
     * "0"?=>?true
     * " 0.1 "?=>?true
     * "abc"?=>?false
     * "1 a"?=>?false
     * "2e10"?=>?true
     * " -90e3? ?"?=>?true
     * " 1e"?=>?false
     * "e3"?=>?false
     * " 6e-1"?=>?true
     * " 99e2.5?"?=>?false
     * "53.5e93"?=>?true
     * " --6 "?=>?false
     * "-+3"?=>?false
     * "95a54e53"?=>?false
     * ˵��:?�������⽫��������رȽ�ģ������ʵ�ִ���֮ǰ����Ӧ������˼�����п��ܵ�������������һ�ݿ��ܴ�������Чʮ���������е��ַ��б�
     * ���� 0-9
     * ָ�� - "e"
     * ��/���� - "+"/"-"
     * С���� - "."
     * ��Ȼ���������У���Щ�ַ���������Ҳ����Ҫ��
     * ������ 2015-02-10:
     * C++��������ʽ�Ѿ������ˡ��������Ȼ������ĺ�������?const char * ���͵Ĳ������������ذ�ť������Ĵ��롣
     * @param s
     * @return
     */
    public static boolean isNumber(String s) {

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNumber(null));
    }
}
