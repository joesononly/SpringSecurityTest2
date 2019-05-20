package www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import www.bean.Menu;
import www.service.manage.MenuService;

import java.util.List;

/*
* Created by:joeson
* Created:20190519
* Comment:管理 - 菜单控制类
* */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @RequestMapping
    public String menu(){
        return "menu";
    }

    @RequestMapping("/query")
    @ResponseBody
    public List<Menu> queryMenus(){
        return menuService.select(new Menu());
    }
}
