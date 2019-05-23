package www.bean;

import javax.persistence.*;

/*
* Created by:joeson
* Created:20190519
* Comment:菜单
* */
@Entity
@Table(name = "S_MENU")
public class Menu extends Base {
    //菜单标题
    @Column(length = 100)
    private String name;

    //菜单备注
    @Column(length = 500)
    private String comment;

    //关联的视图
    @OneToOne
    @JoinColumn(name = "viewId",referencedColumnName = "id")
    private View views;

    //父菜单
    @OneToOne
    @JoinColumn(name = "parentId",referencedColumnName = "id")
    private Menu parent;

    //同级菜单序号
    @Column
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

    public View getViews() {
        return views;
    }

    public void setViews(View views) {
        this.views = views;
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
