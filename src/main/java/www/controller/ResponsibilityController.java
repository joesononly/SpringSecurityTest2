package www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/responsibility")
public class ResponsibilityController {

    @RequestMapping
    public String responsibility(){
        return "responsibility";
    }
}
