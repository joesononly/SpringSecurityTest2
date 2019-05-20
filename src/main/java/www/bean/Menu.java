package www.bean;
/*
* Created by:joeson
* Created:20190519
* Comment:菜单
* */
public class Menu extends Base {
    //菜单标题
    private String name;
    //菜单备注
    private String comment;
    //关联的视图Id
    private Integer viewId;
    //关联的视图
    private View views;
    //父菜单Id
    private String parentId;
    //父菜单
    private Menu parent;
    //同级菜单序号
    private Integer level;

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

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    public View getViews() {
        return views;
    }

    public void setViews(View views) {
        this.views = views;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }
}
