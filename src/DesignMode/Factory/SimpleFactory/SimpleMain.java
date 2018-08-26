package DesignMode.Factory.SimpleFactory;

/**
 * 简单工程模式 破坏了开闭原则 对拓展开放 对修改封闭
 */
public class SimpleMain {
    public static void main(String[] args) {
        Operation operation = SimpleFactory.getOperation(1);
        operation.value1 = 1;
        operation.value2 = 2;
        operation.op();
        operation = SimpleFactory.getOperation(2);
        operation.op();
    }
}
