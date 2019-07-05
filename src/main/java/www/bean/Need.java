package www.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Component
@Entity
@Table(name="S_NEED")
public class Need extends Base{

    @Column(length = 200)
    private String title;

    @Column(name = "BUS_RESP__ID",length = 50)
    private String businessResponsibilityId;

    @Column(name = "TECH_RESP_ID",length = 50)
    private String technologyResponsibilityId;

    @Transient
    private Integer relevanceObjectCount;

    @Column
    private String status;

    @Column
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") //set
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")//get
    private Date runnedTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBusinessResponsibilityId() {
        return businessResponsibilityId;
    }

    public void setBusinessResponsibilityId(String businessResponsibilityId) {
        this.businessResponsibilityId = businessResponsibilityId;
    }

    public String getTechnologyResponsibilityId() {
        return technologyResponsibilityId;
    }

    public void setTechnologyResponsibilityId(String technologyResponsibilityId) {
        this.technologyResponsibilityId = technologyResponsibilityId;
    }

    public Integer getRelevanceObjectCount() {
        return relevanceObjectCount;
    }

    public void setRelevanceObjectCount(Integer relevanceObjectCount) {
        this.relevanceObjectCount = relevanceObjectCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRunnedTime() {
        return runnedTime;
    }

    public void setRunnedTime(Date runnedTime) {
        this.runnedTime = runnedTime;
    }
}
