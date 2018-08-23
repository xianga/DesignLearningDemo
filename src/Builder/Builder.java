package Builder;

/**
 * 建造者
 */
public abstract class Builder {
    protected HTMLPage page = new HTMLPage();
    abstract void buildHead();
    abstract void buildBody();

    public HTMLPage getPage(){
        return this.page;
    }
}
