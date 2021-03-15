package likou.August;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * test
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class Test2 {
    public static void main(String[] args) {
       int[] a = new int[2];
       Object[] o = new Object[2];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(o));

    }

    /**
     * ��ȡҪ��͵�����
     * @param nodes
     * @param n
     * @return
     */
    private static int[] getSumNumbers(Node[] nodes, int n) {
        int[] count = new int[nodes.length];
        //��ȡÿ������ĳ���
        for (int i = 0;i<nodes.length;i++){
            Node node = nodes[i];
            while (node != null){
                count[i]++;
                node = node.next;
            }
        }
        //��ȡ�����Ӧ��͵�ȡֵ
        int[] result = new int[nodes.length];
        for (int i = 0;i<nodes.length;i++){
            Node node = nodes[i];
            int end = count[i] - n;
            int t = 0;
            while (true){
                if (t==end){
                    result[i] = Integer.valueOf((String) node.getData());
                    break;
                }
                node = node.next;
                t++;
            }
        }
        return result;
    }
}
