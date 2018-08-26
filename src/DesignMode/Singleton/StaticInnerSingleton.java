package DesignMode.Singleton;

/**
 * 静态内部类单例
 */
public class StaticInnerSingleton {
    private static class innerClass{
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    private StaticInnerSingleton(){}

    public static StaticInnerSingleton getInstance(){
        return innerClass.instance;
    }
}
