package Factory.Factory;

public class AddOP implements Option {
    @Override
    public void op(int a ,int b) {
        System.out.println("a+b的值是：---" + a+b);
    }
}
