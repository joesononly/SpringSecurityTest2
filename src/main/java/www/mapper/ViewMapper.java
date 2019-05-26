package www.mapper;

import org.springframework.stereotype.Service;
import www.bean.Responsibility;
import www.bean.View;

import java.util.List;

@Service
public interface ViewMapper extends  BaseMapper<View>{

    public List<Responsibility> findResponsibilitysByViewName(String viewName);

    public List<View> findAllViewAndResponsibility();
}
