package aj.sp6.thymeleaf.springthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String sayHello(Model m) {
        m.addAttribute("curTime", new java.util.Date());
        return "hello"; //html file name
    }
}
