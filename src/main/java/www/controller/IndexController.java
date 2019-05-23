package www.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import www.bean.Account;

import java.lang.invoke.MethodType;

@Controller
@RequestMapping("/")
@Api(tags = "主页")
public class IndexController {

    @Autowired
    Account account;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "显示主页")
    public String index(){
        account.setAccountName("客户");
        System.out.println("login");
        return "index";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
