package www.bean;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Component
@Entity
@Table(name = "S_NEED_OBJ")
public class NeedObject extends Base {
    @Column
    private Integer needId;
    @Column
    private String type;
    @Column
    private String name;

    public Integer getNeedId() {
        return needId;
    }

    public void setNeedId(Integer needId) {
        this.needId = needId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
