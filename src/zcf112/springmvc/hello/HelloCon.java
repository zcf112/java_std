package zcf112.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HelloCon {
    @RequestMapping("/say")
    public String say(Model model){//参数中传入Model
        model.addAttribute("name","wormday");//制定Model的值
        model.addAttribute("url","http://www.cnblogs.com/wormday/p/8435617.html");// 指定Model的值
        return "say";
    }
}
