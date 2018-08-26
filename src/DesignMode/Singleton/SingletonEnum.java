package DesignMode.Singleton;

interface say{
    void sayHello();
}
public enum SingletonEnum implements say{
    INSTANCE;


    @Override
    public void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        SingletonEnum.INSTANCE.sayHello();
    }
}
