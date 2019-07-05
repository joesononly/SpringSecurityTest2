package www.service.need;

import org.springframework.beans.factory.annotation.Autowired;
import www.bean.Need;
import www.bean.NeedObject;
import www.mapper.NeedMapper;
import www.service.OperateService;

import java.util.List;

public class NeedService implements OperateService<Need> {

    @Autowired
    NeedMapper needMapper;

    @Override
    public void insert(Need data) {

    }

    @Override
    public void delete(Need data) {

    }

    @Override
    public void update(Need data) {

    }

    @Override
    public List<Need> select(Need object) {
        return needMapper.select(object);
    }

    public List<NeedObject> selectNeedObjectByNeedId(Integer needId){
        return needMapper.selectNeedObject(needId);
    }
}
