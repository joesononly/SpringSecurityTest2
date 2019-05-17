package www.bean;

import java.util.Date;

/*
* Created by:zjh
* Created:20190517
* Comment:基表父类
* */
public class Base {
    //主键
    private String id;
    //创建时间
    private Date created;
    //创建人Id
    private String createdBy;
    //修改时间
    private String lastUpdate;
    //修改人Id
    private String lastUpdateBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }
}
