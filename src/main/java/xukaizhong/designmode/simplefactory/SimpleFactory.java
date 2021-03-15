package xukaizhong.designmode.simplefactory;

/**
 * @author xukaizhong
 * @date 2021/3/153:12 下午
 * @description ：
 */
public class SimpleFactory {
    final static int aType = 1;
    final static int bType = 2;

    static Product markProduct(int type){
        switch (type){
            case aType:
                return new ProductOne();
            case bType:
                return new ProductTwo();
        }
        return null;

    }
}
