package www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
*  Created by:joeson
*  Created:20190515
*  Comment:用户登录控制类
* */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping
    public String login(){
        return "login";
    }
}
