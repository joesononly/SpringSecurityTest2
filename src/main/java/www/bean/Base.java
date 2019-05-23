package www.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/*
* Created by:zjh
* Created:20190517
* Comment:基表父类
* */
@MappedSuperclass
public class Base {
    //主键
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    //创建时间
    @Column
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") //set
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")//get
    private Date created;

    //创建人Id
    @Column
    private Integer createdBy;

    //修改时间
    @Column
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") //set
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")//get
    private String lastUpdate;

    //修改人Id
    @Column
    private Integer lastUpBy;

    //修改版本号
    @Column
    private Integer updateVersion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getLastUpBy() {
        return lastUpBy;
    }

    public void setLastUpBy(Integer lastUpBy) {
        this.lastUpBy = lastUpBy;
    }

    public Integer getUpdateVersion() {
        return updateVersion;
    }

    public void setUpdateVersion(Integer updateVersion) {
        this.updateVersion = updateVersion;
    }
}
