package Factory.AbstractFactory;

public class WorkTableFactory implements TableFactory {

    @Override
    public Table getYijiaTable() {
        return new WorkTable();
    }
}
