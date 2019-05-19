package www.service.permision.mapper;

import org.springframework.stereotype.Component;
import www.bean.Responsibility;

import java.util.List;

public interface ResposibilityMapper {
    public void insert(Responsibility responsibility);

    public void delete(Responsibility responsibility);

    public List<Responsibility> select(Responsibility responsibility);
}
