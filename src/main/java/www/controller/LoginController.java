package www.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
*  Created by:joeson
*  Created:20190515
*  Comment:用户登录控制类
* */
@Controller
@RequestMapping("/login")
@Api(tags = "登录控制类")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "展示登录页面")
    public String login(){
        return "login";
    }
}
