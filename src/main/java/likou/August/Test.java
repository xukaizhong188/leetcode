package likou.August;

import java.util.Scanner;

/**
 *
 * test
 *
 * @author xukaizhong
 * @date 2018/07/01
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Node[] nodes = new Node[k];
        for (int i = 0; i < k; i++) {
            String a = sc.next();
            String[] as = a.split(",");
            //����Ӵ������Ԫ�ص�����
            Node head = null;//ͷ�ڵ�
            Node temp = null;//��ʱ�ڵ�
            Node cur = new Node();//��ǰ���
            for (int j = 0; j < as.length; j++) {
                temp = new Node(as[j]);
                if (j == 0) {//��ͷ���ڵ�
                    head = temp;
                } else {//���ǵڶ����ڵ�
                    cur.setNext(temp);
                }
                cur = temp;
            }
            nodes[i] = head;
        }
        int[] numbs = getSumNumbers(nodes,n);

        int sum = 0;
        for (int i = 0 ;i<numbs.length;i++){
            sum = sum + numbs[i];
        }
        System.out.println(sum);
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

class Node {
    public Object data;
    public Node next;
    public Node(){

    }
    public Node(Object e){
        this.data = e;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
