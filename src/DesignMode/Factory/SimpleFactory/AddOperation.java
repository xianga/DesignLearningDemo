package DesignMode.Factory.SimpleFactory;

public class AddOperation extends Operation {
    @Override
    protected void op() {
        System.out.println(this.value1 + this.value2);
    }
}
