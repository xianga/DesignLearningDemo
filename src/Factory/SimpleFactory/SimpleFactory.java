package Factory.SimpleFactory;

public class SimpleFactory {

    public static Operation getOperation(int type){
        switch (type){
            case 1 : return new AddOperation();
            case 2 : return new SubOperation();
            default: return new AddOperation();
        }
    }
}
