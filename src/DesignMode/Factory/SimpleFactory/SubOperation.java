package DesignMode.Factory.SimpleFactory;

import DesignMode.Factory.SimpleFactory.Operation;

public class SubOperation extends Operation {
    @Override
    protected void op() {
        System.out.println(this.value1 - this.value2);
    }
}
