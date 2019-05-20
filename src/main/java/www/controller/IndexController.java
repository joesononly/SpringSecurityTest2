package www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import www.bean.Account;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    Account account;

    @RequestMapping
    public String index(){
        account.setAccountName("客户");
        System.out.println("login");
        return "index";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
