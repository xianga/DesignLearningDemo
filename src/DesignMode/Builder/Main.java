package DesignMode.Builder;

/**
 * 建造者模式 新建同一类对象 针对的是大对象的零件内容不同
 */
public class Main {
    public static void main(String[] args) {
        // 新建建造者
        Builder builder = new HomePageBuilder();
        // 指挥者知会建造者制作
        Director.BuildPage(builder);
        HTMLPage page = builder.getPage();
        System.out.println("page的值是：---" + page.toString());
    }
}
