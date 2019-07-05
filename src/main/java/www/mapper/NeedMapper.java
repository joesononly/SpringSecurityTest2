package www.mapper;


import www.bean.Need;
import www.bean.NeedObject;

import java.util.List;

public interface NeedMapper extends BaseMapper<Need>{

    public List<NeedObject> selectNeedObject(Integer needId);
}
