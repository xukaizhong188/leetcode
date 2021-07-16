package likou.July;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulyTwo {
    /**
     * ����һ������?candies?��һ������?extraCandies?������?candies[i]?����� i ������ӵ�е��ǹ���Ŀ��
     *  ��ÿһ�����ӣ�����Ƿ����һ�ַ������������?extraCandies?���ǹ������������֮�󣬴˺����� ���?���ǹ���ע�⣬�����ж������ͬʱӵ�� ���?���ǹ���Ŀ��
     *  ʾ�� 1��
     *  ���룺candies = [2,3,5,1,3], extraCandies = 3
     *  �����[true,true,true,false,true]
     *  ���ͣ�
     *  ���� 1 �� 2 ���ǹ���������õ����ж�����ǹ���3��������ô���ܹ��� 5 ���ǹ���������Ϊӵ������ǹ��ĺ��ӡ�
     *  ���� 2 �� 3 ���ǹ���������õ����� 2 �������ǹ�����ô������Ϊӵ������ǹ��ĺ��ӡ�
     *  ���� 3 �� 5 ���ǹ������Ѿ���ӵ������ǹ��ĺ��ӡ�
     *  ���� 4 �� 1 ���ǹ�����ʹ���õ����ж�����ǹ�����Ҳֻ�� 4 ���ǹ����޷���Ϊӵ���ǹ����ĺ��ӡ�
     *  ���� 5 �� 3 ���ǹ���������õ����� 2 �������ǹ�����ô������Ϊӵ������ǹ��ĺ��ӡ�
     *  ʾ�� 2��
     *  ���룺candies = [4,2,1,1,2], extraCandies = 1
     *  �����[true,false,false,false,false]
     *  ���ͣ�ֻ�� 1 �������ǹ������Բ��ܶ����ǹ���˭��ֻ�к��� 1 ���Գ�Ϊӵ���ǹ����ĺ��ӡ�
     *  ʾ�� 3��
     *  ���룺candies = [12,1,12], extraCandies = 10
     *  �����[true,false,true]
     *  ��ʾ��
     *
     *  2 <= candies.length <= 100
     *  1 <= candies[i] <= 100
     *  1 <= extraCandies <= 50
     * @param candies
     * @param extraCandies
     * @return
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        //�ҳ�����
        int max = 0;
        for (int i = 0;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }

        for (int i = 0;i<candies.length;i++){
            result.add(max - candies[i] <= extraCandies);
        }

        return result;
    }

    /**
     * ����һ������ nums ���������� 2n ��Ԫ�أ��� [x1,x2,...,xn,y1,y2,...,yn] �ĸ�ʽ���С�
     * ���㽫���鰴 [x1,y1,x2,y2,...,xn,yn] ��ʽ�������У��������ź�����顣
     * ʾ�� 1��
     * ���룺nums = [2,5,1,3,4,7], n = 3
     * �����[2,3,5,4,1,7]
     * ���ͣ����� x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 �����Դ�Ϊ [2,3,5,4,1,7]
     * ʾ�� 2��
     * ���룺nums = [1,2,3,4,4,3,2,1], n = 4
     * �����[1,4,2,3,3,2,4,1]
     * ʾ�� 3��
     * ���룺nums = [1,1,2,2], n = 2
     * �����[1,2,1,2]
     * ��ʾ��
     * 1 <= n <= 500
     * nums.length == 2n
     * 1 <= nums[i] <= 10^3
     * @param nums
     * @param n
     * @return
     */
    public static int[] shuffle1(int[] nums, int n) {

        int[] result = new int[nums.length];
        int[] num1 = new int[n];
        int[] num2 = new int[n];
        for (int i = 0;i < nums.length ;i ++){
            if (i < n){
                num1[i] = nums[i];
            }else {
                num2[i-n] = nums[i];
            }
        }
        boolean userNum1 = true;
        int j = 0;
        for (int i = 0 ;i < result.length ;i++){
            if (userNum1){
                result[i] = num1[j];
                userNum1 = false;
            }else {
                result[i] = num2[j];
                userNum1 = true;
                j++;
            }

        }

        return result;
    }
    public static int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];
        int j = 0;
        for (int i = 0;i < nums.length ;i+=2){
            result[i] = nums[j];
            j++;
        }
        for (int i = 1 ;i < result.length ;i+=2){
            result[i] = nums[j];
            j++;
        }

        return result;
    }

    /**
     *
     �ַ���������ת�����ǰ��ַ���ǰ������ɸ��ַ�ת�Ƶ��ַ�����β�����붨��һ������ʵ���ַ�������ת�����Ĺ��ܡ�
     ���磬�����ַ���"abcdefg"������2���ú�������������ת��λ�õ��Ľ��"cdefgab"��
     ʾ�� 1��
     ����: s = "abcdefg", k = 2
     ���: "cdefgab"
     ʾ�� 2��
     ����: s = "lrloseumgh", k = 6
     ���: "umghlrlose"
     ���ƣ�
     1 <= k < s.length <= 10000
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords(String s, int n) {
        String beginString = s.substring(0,n);
        String endString = s.substring(n,s.length());
        return endString+beginString;
    }



    /**
     * ListNode���
     * ʵ��һ���㷨��ɾ�����������м��ĳ���ڵ㣨�����ǵ�һ�������һ���ڵ㣩���ٶ���ֻ�ܷ��ʸýڵ㡣
     * ʾ����
     * ���룺��������a->b->c->d->e->f�еĽڵ�c
     * ������������κ����ݣ����������Ϊa->b->d->e->f
     * @author xukaizhong
     * @date 2020-07-02 16:04
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * СA �� СB ��������֡�СB ÿ�δ� 1, 2, 3 �����ѡ��һ����СA ÿ��Ҳ�� 1, 2, 3 ��ѡ��һ���¡�����һ���������������Ϸ���뷵�� СA �¶��˼��Σ�
     * �����guess����Ϊ СA ÿ�εĲ²⣬answer����Ϊ СB ÿ�ε�ѡ��guess��answer�ĳ��ȶ�����3��
     * ʾ�� 1��
     * ���룺guess = [1,2,3], answer = [1,2,3]
     * �����3
     * ���ͣ�СA ÿ�ζ��¶��ˡ�
     * ʾ�� 2��
     * ���룺guess = [2,2,3], answer = [3,2,1]
     * �����1
     * ���ͣ�СA ֻ�¶��˵ڶ��Ρ�
     * ���ƣ�
     * guess�ĳ��� = 3
     * answer�ĳ��� = 3
     * guess��Ԫ��ȡֵΪ {1, 2, 3} ֮һ��
     * answer��Ԫ��ȡֵΪ {1, 2, 3} ֮һ��
     * @param guess
     * @param answer
     * @return
     */
    public int game(int[] guess, int[] answer) {
        int result = 0;
        for (int i= 0;i<guess.length;i++){
            if (guess[i] == answer[i]){
                result++;
            }
        }

        return result;
    }

    /**
     * ?�����ַ���J?����ʯͷ�б�ʯ�����ͣ����ַ���?S������ӵ�е�ʯͷ��?S?��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��
     * J?�е���ĸ���ظ���J?��?S�е������ַ�������ĸ����ĸ���ִ�Сд�����"a"��"A"�ǲ�ͬ���͵�ʯͷ��
     * ʾ�� 1:
     * ����: J = "aA", S = "aAAbbbb"
     * ���: 3
     * ʾ�� 2:
     * ����: J = "z", S = "ZZ"
     * ���: 0
     * ע��:
     * S?��?J?��ຬ��50����ĸ��
     * ?J?�е��ַ����ظ���
     * @param J
     * @param S
     * @return
     */
    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        char[] jChar = J.toCharArray();
        char[] sChar = S.toCharArray();
        for (int i = 0;i<sChar.length;i++){
            for (int j = 0;j<jChar.length;j++){
                if (jChar[j] == sChar[i]){
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * ����һ��?n x n?��������ÿ�к�ÿ��Ԫ�ؾ������������ҵ������е� k С��Ԫ�ء�
     * ��ע�⣬���������ĵ� k СԪ�أ������ǵ� k ����ͬ��Ԫ�ء�
     * ʾ����
     * matrix = [
     *    [ 1,  5,  9],
     *    [10, 11, 13],
     *    [12, 13, 15]
     * ],
     * k = 8,
     * ���� 13��
     * ��ʾ��
     * ����Լ��� k ��ֵ��Զ����Ч�ģ�1 �� k �� n2?��
     * @param matrix
     * @param k
     * @return
     */
    public static int kthSmallest(int[][] matrix, int k) {
        //��������Ѱ�ҵ�k��Ԫ��
        List<Integer> list = new ArrayList<Integer>();

        int m = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);

        return list.get(k-1);
    }

    /**
     * ����˳�������ֱ���Ҳ�����
     * @param matrix
     * @param k
     * @return
     */
    public static int kthSmallest2(int[][] matrix, int k) {
        //�ҵ�k����Сֵ������K����Сֵ�����ֵ
        int result = matrix[0][0];
        int min = matrix[0][0];
        int m = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                //��û�ﵽk����Сֵ
                if (m <= k-1){
                    if (min <= matrix[i][j]){
                        min = matrix[i][j];
                    }
                    result = min;
                    m++;
                }else {
                    if (matrix[ i][j] <= min){
                        result = matrix[i][j];
                    }
                }
            }
        }

        return result;
    }
    public static int kthSmallest3(int[][] matrix, int k) {
        //��ȡ����n
        int n = matrix[0].length;
        int start = k / n;
        //����Ҫ��find����
        int find = k- start;

        int result = matrix[0][0];
        int min = matrix[0][0];
        int m = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                //��û�ﵽk����Сֵ
                if (m <= k-1){
                    if (min <= matrix[i][j]){
                        min = matrix[i][j];
                    }
                    result = min;
                    m++;
                }else {
                    if (matrix[ i][j] <= min){
                        result = matrix[i][j];
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        //[[],[],[],[],[]]
        //5
        int[][] a2 = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[][] a1 = new int[][]{{1,5,9},{10,11,13},{12,13,15}};
        int[][] a = new int[][]{{-5}};
        System.out.println(kthSmallest2(a2,5));
        //System.out.println(kthSmallest2(a1,8));
        //System.out.println(kthSmallest2(a,1));
    }
}
