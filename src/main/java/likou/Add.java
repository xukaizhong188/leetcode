package likou;

/**
 * Add
 *
 * @author xukaizhong
 * @date 2018/07/01
 */

import java.util.List;

/**
 * 给出两个?非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照?逆序?的方式存储的，并且它们的每个节点只能存储?一位?数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0?开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
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