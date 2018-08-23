package Singleton;

public class StaticInnerSingleton {
    private static class innerClass{
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    private StaticInnerSingleton(){}

    public static StaticInnerSingleton getInstance(){
        return innerClass.instance;
    }
}
