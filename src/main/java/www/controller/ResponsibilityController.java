package www.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/responsibility")
@Api(tags = "职责控制类")
public class ResponsibilityController {

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation("展示 管理 - 职责 页面")
    public String responsibility(){
        return "responsibility";
    }
}
