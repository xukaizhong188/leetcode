package likou;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulySeven {
    /**
     * ����һ����Ч�� IPv4 ��ַ?address��������� IP ��ַ����Ч���汾��
     * ��ν��Ч��?IP ��ַ����ʵ������?"[.]"?������ÿ�� "."��
     * ʾ�� 1��
     * ���룺address = "1.1.1.1"
     * �����"1[.]1[.]1[.]1"
     * ʾ�� 2��
     * ���룺address = "255.100.50.0"
     * �����"255[.]100[.]50[.]0"
     * ��ʾ��
     * ������?address?��һ����Ч�� IPv4 ��ַ
     *
     * @param address
     * @return
     */
    public static String defangIPaddr(String address) {

        return address.replaceAll("\\.","[.]");
    }

    /**
     * StringBuilderҪ��StringЧ�ʸ��ߣ��ؼ�����StringBuilder��ֵ��char��final�����������ٴ����ڴ�����Ŀ�����
     * @param address
     * @return
     */
    public static String defangIPaddr2(String address) {

        char[] addressChar = address.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i<addressChar.length;i++){
            if ('.' == addressChar[i]){
                stringBuilder.append("[.]");
            }else {
                stringBuilder.append(addressChar[i]);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * ����һ����������һ��Ŀ��ͣ��жϸ������Ƿ���ڸ��ڵ㵽Ҷ�ӽڵ��·��������·�������нڵ�ֵ��ӵ���Ŀ��͡�
     * ˵��:?Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
     * ʾ��:?
     * �������¶��������Լ�Ŀ��� sum = 22��
     *               5
     *              / \
     *             4   8
     *            /   / \
     *           11  13  4
     *          /  \      \
     *         7    2      1
     * ���� true, ��Ϊ����Ŀ���Ϊ 22 �ĸ��ڵ㵽Ҷ�ӽڵ��·�� 5->4->11->2��
     *
     * ���⣺���������к��Σ�+Ȼ�����
     *
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        boolean result = false;
        return result;

    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }