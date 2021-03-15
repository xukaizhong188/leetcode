package xukaizhong.designmode.abstraxtfactory;

/**
 * @author xukaizhong
 * @date 2021/3/153:12 下午
 * @description ：
 */
public class BFactory implements AbstraxtFactory {

    public POne newProduct() {
        return new ProductTwo();
    }

    public PTwo newPTow() {
        return null;
    }
}
