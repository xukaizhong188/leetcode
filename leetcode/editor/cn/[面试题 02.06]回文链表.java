//编写一个函数，检查输入的链表是否是回文的。
// 示例 1：
// 输入： 1->2
//输出： false
// 示例 2：
// 输入： 1->2->2->1
//输出： true
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 栈 递归 链表 双指针 
// 👍 74 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
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
    public  boolean isPalindromeThree(ListNode head){

        //定义快慢指针
        ListNode slowNode = head;
        ListNode fastNode = head;
        //找到中间节点
        while (fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        //如果fast节点不是null,为奇数，那么slow还需要进行一步，反转使用

        if (fastNode != null){
            slowNode = slowNode.next;
        }

        //反转中间节点到尾部节点数据
        ListNode rightNoede = head;
        ListNode liftNode = res(slowNode);
        //遍历判断是否为回文
        while (rightNoede.next != null){
            if (liftNode.val != rightNoede.val){
                return false;
            }
            liftNode = liftNode.next;
            rightNoede = rightNoede.next;
        }

        //恢复原链表(看条件)


        return true;
    }

    /**
     * 方案二：利用递归进行压榨，实现倒序
     * @param head
     * @return
     */
    public boolean isPalindromeTwo(ListNode head){

    }


    /**
     * 递归得到对应新节点
     * @param head
     * @return
     */
    public ListNode getNode(ListNode head){

    }

    /**
     * 方案一：复制一份链表出来，反转进行对比
     * @param head
     * @return
     */
    public boolean isPalindromeOne(ListNode head) {

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
    public ListNode res(ListNode head){
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
    public ListNode copy(ListNode head){
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
//leetcode submit region end(Prohibit modification and deletion)
