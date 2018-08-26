package DesignMode.Builder;

/**
 * 指挥者：控制建造顺序
 */
public class Director {

    public static void BuildPage(Builder builder){
        builder.buildBody();
        builder.buildHead();
    }
}
