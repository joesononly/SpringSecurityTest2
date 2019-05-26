package www.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "S_RESP_VIEW")
public class ResponsibilityView extends Base {
    @Column
    private Integer responsibilityId;

    @Column
    private Integer viewId;

    public Integer getResponsibilityId() {
        return responsibilityId;
    }

    public void setResponsibilityId(Integer responsibilityId) {
        this.responsibilityId = responsibilityId;
    }

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }
}
