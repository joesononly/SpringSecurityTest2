package www.service.permision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import www.bean.Responsibility;
import www.service.OperateService;
import www.service.permision.mapper.ResposibilityMapper;

import java.util.List;

/*
* Created by:zjh
* Created:20190517
* Comment:职责的服务类
* */
@Component
public class ResponsibilityService implements OperateService<Responsibility> {

    @Autowired
    ResposibilityMapper resposibilityMapper;

    @Override
    public void insert(Responsibility data){
        resposibilityMapper.insert(data);
    }

    public void insert(List<Responsibility> datas){
        /*
        * Comment:批量新建职责
        * */
        for(Responsibility r:datas)
        {
            insert(r);
        }
    }

    @Override
    public void delete(Responsibility data) {
        resposibilityMapper.delete(data);
    }

    public void delete(List<Responsibility> datas){
        /*
        * Comment:批量删除
        * */
        for(Responsibility r:datas)
        {
            delete(r);
        }
    }

    @Override
    public void update(Responsibility data) {

    }

    @Override
    public List<Responsibility> select(Responsibility object) {
        return resposibilityMapper.select(object);
    }
}
