package io.github.x1111101101.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value="/hello", method = RequestMethod.GET) // SpringBoot 3에서 SpringBoot 2의 RestController와 같은 기능을 만들기 위함
    public String hello() {
        return "hello";
    }

}
