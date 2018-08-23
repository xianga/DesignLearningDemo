package Factory.Factory;

public class AddFactory implements Factory {
    @Override
    public Option getInstance() {
        return new AddOP();
    }
}
