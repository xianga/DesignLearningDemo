package Singleton;

/**
 * 懒汉式
 */
public class Singleton2 {
    private Singleton2 (){}
    private static Singleton2 instance = null;

    /**
     * 线程不安全
     * @return
     */
    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

    /**
     * 双重检测 保证线程安全
     */
    public static Singleton2 getInstance1(){
        if(instance == null){
            synchronized (Singleton2.class){
                if(instance == null){
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
