package likou;

import java.util.List;

/**
 * A
 *
 * @author xukaizhong
 * @date 2018/07/01
 */

public class A {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(0);
        ListNode three = new ListNode(1);
        //ListNode four = new ListNode(1);
        one.next = two;
        two.next = three;
        //three.next = four;
        //System.out.println(getNode(one));

        System.out.println(isPalindrome(one));

    }

    public static boolean isPalindrome(ListNode head) {
        //方案一：
        //return isPalindromeOne(head);
        //方案二：
        //return isPalindromeOne(head);
        //方案三：

        return isPalindromeThree(head);
    }
    /**
     * 方案三：利用双指针，快慢指针找到中间节点
     * @param head
     * @return
     */
    public static boolean isPalindromeThree(ListNode head){

        //定义快慢指针
        ListNode p = head;//记录slow前一个指针，恢复链表使用
        ListNode slowNode = head;
        ListNode fastNode = head;
        //找到中间节点
        while (fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            p = slowNode;
            slowNode = slowNode.next;
        }
        //如果fast节点不是null,为奇数，那么slow还需要进行一步，反转使用

        if (fastNode != null){
            p = slowNode;
            slowNode = slowNode.next;
        }

        //反转中间节点到尾部节点数据

        ListNode rightNoede = head;
        ListNode liftNode = res(slowNode);
        ListNode liftNodeOld =liftNode;//恢复使用
        //遍历判断是否为回文
        while (rightNoede != null){
            if (liftNode == null || rightNoede == null){
                break;
            }
            if (liftNode.val != rightNoede.val){
                return false;
            }
            liftNode = liftNode.next;
            rightNoede = rightNoede.next;
        }

        //恢复原链表(看条件)

        p.next = res(liftNodeOld);
        return true;
    }




    static ListNode houquNode;

    /**
     * 反转部分链表
     * @param head
     * @param left
     * @param right
     * @return
     */
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1){
            return reverseN(head,right);
        }
        head.next = reverseBetween(head.next,left-1,right-1);
        return head;
    }
    /**
     * 反转前n个节点
     * @param head
     * @param n
     * @return
     */
    public static ListNode reverseN(ListNode head,int n){
        if (n == 1 ){
            houquNode = head.next;
            return head;
        }
        ListNode listNode = reverseN(head.next,n-1);
        head.next.next = head;
        head.next = houquNode;
        return listNode;
    }


    /**
     * 方案二：利用递归进行压榨，实现倒序
     * @param head
     * @return
     */
    public static boolean isPalindromeTwo(ListNode head){

        return false;
    }


    /**
     * 递归得到对应新节点
     * @param head
     * @return
     */
    public static ListNode getNode(ListNode head){
        if (head == null ){
            return head;
        }
       /* head = getNode(head.next);
        System.out.println(head.val);*/
        ListNode node = getNode(head.next);
        head.next = node;
        return head;

    }

    /**
     * 方案一：复制一份链表出来，反转进行对比
     * @param head
     * @return
     */
    public static boolean isPalindromeOne(ListNode head) {

        //复制一份原链表；

        ListNode oldNode = copy(head);

        //原链表反转
        ListNode newNode = res(head);

        ListNode a = oldNode;
        ListNode b = newNode;
        while (a.next != null){

            if (a.val != b.val){
                return false;
            }
            a =a.next;
            b = b.next;
        }

        return true;
    }

    /**
     * 方法一：递归（迭代）反转链表，然后进行对比
     * @param head
     * @return
     */
    public static ListNode res(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode listNode = res(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;

    }

    /**
     * 复制链表
     * @param head
     * @return
     */
    public static ListNode copy(ListNode head){
        if (head == null){
            return null;
        }
        ListNode result = new ListNode(head.val);
        //值需要复制，next也需要复制
        ListNode newHead =  copy(head.next);

        result.next = newHead;
        return result;
    }

}