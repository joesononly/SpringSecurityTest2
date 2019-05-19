package www.bean;

/*
* Created by:zjh
* Created:20190519
* Comment:页面视图存储类
* */
public class View extends Base {
    //视图地址
    private String url;
    //视图名称
    private String name;
    //备注
    private String comment;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
