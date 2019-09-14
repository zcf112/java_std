package zcf112.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class login {
    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("name", "day");//制定Model的值
        model.addAttribute("url", "http://www.cnblogs.com/wormday/p/8435617.html");/* 指定Model的值*/
        return "login";
    }
}
