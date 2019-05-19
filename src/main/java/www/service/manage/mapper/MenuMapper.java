package www.service.manage.mapper;

import www.bean.Menu;
import www.service.BaseMapper;

import java.util.List;

public interface MenuMapper{

    public void insert(Menu data);

    public void delete(Menu data);

    public List<Menu> select(Menu data);

    public void update(Menu data);
}
