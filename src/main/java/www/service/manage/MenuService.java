package www.service.manage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.bean.Menu;
import www.service.OperateService;
import www.service.manage.mapper.MenuMapper;

import java.util.List;
/*
* Created by:joeson
* Created:20190519
* Comment:管理 - 菜单
* */
@Service
public class MenuService implements OperateService<Menu> {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public void insert(Menu data) {

    }

    @Override
    public void delete(Menu data) {

    }

    @Override
    public void update(Menu data) {

    }

    @Override
    public List<Menu> select(Menu object) {
        return menuMapper.select(object);
    }
}
