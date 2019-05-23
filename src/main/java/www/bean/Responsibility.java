package www.bean;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/*
* Created by:joeson
* Created:20190517
* Comment:职责
* */
@Component
@Entity
@Table(name = "S_RESP")
public class Responsibility extends Base {
    //职责名称
    @Column(length = 100)
    private String name;

    //备注
    @Column(length = 500)
    private String comment;


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
