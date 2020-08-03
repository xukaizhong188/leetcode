package likou.July;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JulyOn
 * @author xukaizhong
 * @date 2018/07/01
 */
public class JulySixteen {
    /**
     * �����������飬��дһ���������������ǵĽ�����
     * ʾ�� 1��
     * ���룺nums1 = [1,2,2,1], nums2 = [2,2]
     * �����[2,2]
     * ʾ�� 2:
     * ���룺nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * �����[4,9]
     * ˵����
     * ��������ÿ��Ԫ�س��ֵĴ�����Ӧ��Ԫ�������������г��ִ�������Сֵһ�¡�
     * ���ǿ��Բ�������������˳��
     * ���ף�
     * ��������������Ѿ��ź����أ��㽫����Ż�����㷨��
     * ���?nums1?�Ĵ�С��?nums2?С�ܶ࣬���ַ������ţ�
     * ���?nums2?��Ԫ�ش洢�ڴ����ϣ������ڴ������޵ģ������㲻��һ�μ������е�Ԫ�ص��ڴ��У������ô�죿
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {

        int[] mapNum = nums1.length>=nums2.length?nums1:nums2;
        int[] seleNum = nums1.length<nums2.length?nums1:nums2;
        int num = 0;
        //�������ٵ�����ת��Ϊmap,keyΪֵ��valueΪ����
        Map<Integer,Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0;i<mapNum.length;i++){
            if (numMap.containsKey(mapNum[i])){
                num = numMap.get(mapNum[i]);
            }
            numMap.put(mapNum[i],++num);
            num = 0;
        }

        List<Integer> result = new ArrayList<Integer>();
        //������һ�����飬
        for (int i= 0;i<seleNum.length;i++){
            //������
            if (numMap.containsKey(seleNum[i]) && numMap.get(seleNum[i]) != 0){
                result.add(seleNum[i]);
                numMap.put(seleNum[i],0);
            }
        }
        int[] resultNum = new int[result.size()];
        for (int i = 0; i<result.size();i++){
            resultNum[i] = result.get(i);
        }
        return resultNum;
    }

    public static void main(String[] args) {
        int[] res = intersect(new int[]{1,2},new int[]{1,1});
        for (int i = 0;i<res.length;i++){
            System.out.println(res[i]);

        }
    }
}
