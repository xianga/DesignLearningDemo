package DesignMode.Builder;

public class HomePageBuilder extends Builder {
    @Override
    void buildHead() {
        this.page.setHead("home-head");
    }

    @Override
    void buildBody() {
        this.page.setBody("home-body");
    }
}
