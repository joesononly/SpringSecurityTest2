package www.service.permision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.bean.Responsibility;
import www.bean.View;
import www.mapper.ViewMapper;

import java.util.List;

@Service
public class ViewService {

    @Autowired
    private ViewMapper viewMapper;

    public List<Responsibility> findResponsibilityByViewName(String viewName){
        return viewMapper.findResponsibilitysByViewName(viewName);
    }

    public List<View> findAllViewAndResponsibility(){
        return viewMapper.findAllViewAndResponsibility();
    }
}
