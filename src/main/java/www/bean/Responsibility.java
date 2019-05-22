package www.bean;

import org.springframework.stereotype.Component;

/*
* Created by:joeson
* Created:20190517
* Comment:职责
* */
@Component
public class Responsibility extends Base {
    //职责名称
    private String name;
    //备注
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
