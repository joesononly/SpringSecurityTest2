package www.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@Api(tags = "菜单控制类")
public class MenuController {

    @Autowired
    MenuService menuService;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "展示 管理 - 菜单 页面")
    public String menu(){
        return "menu";
    }

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询所有菜单")
    public List<Menu> queryMenus(){
        return menuService.select(new Menu());
    }
}
