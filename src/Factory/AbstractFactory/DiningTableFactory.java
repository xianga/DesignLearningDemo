package Factory.AbstractFactory;

public class DiningTableFactory implements TableFactory {
    @Override
    public Table getYijiaTable() {
        return new DiningTable();
    }
}
