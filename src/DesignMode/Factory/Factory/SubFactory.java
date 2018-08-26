package DesignMode.Factory.Factory;

public class SubFactory implements Factory {
    @Override
    public Option getInstance() {
        return new SubOP();
    }
}
