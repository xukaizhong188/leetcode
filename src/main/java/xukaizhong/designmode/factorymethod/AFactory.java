package xukaizhong.designmode.factorymethod;

/**
 * @author xukaizhong
 * @date 2021/3/153:12 下午
 * @description ：
 */
public class AFactory implements AbstraxtFactory{

    public Product newProduct() {
        return new ProductOne();
    }
}
