package likou;

/**
 * Add
 *
 * @author xukaizhong
 * @date 2018/07/01
 */

import java.util.List;

/**
 * ��������?�ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ���?����?�ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢?һλ?���֡�
 * ��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
 * �����Լ���������� 0 ֮�⣬���������������� 0?��ͷ��
 * ʾ����
 * ���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * �����7 -> 0 -> 8
 */
public class Add {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultListNode = null;

        while (l1 != null || l2 != null){
            ListNode listNode = null;
            int a = 0;
            if (l1 != null){
                a = l1.val;
            }
            int b = 0;
            if (l2 != null){
                b = l2.val;
            }
            int sum = a +b;
            if (sum >= 10){
            }
        }

        return resultListNode;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}