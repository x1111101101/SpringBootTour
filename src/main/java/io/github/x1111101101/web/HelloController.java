package io.github.x1111101101.web;

import io.github.x1111101101.web.dto.HelloResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value="/hello", method = RequestMethod.GET) // SpringBoot 3에서 SpringBoot 2의 RestController와 같은 기능을 만들기 위함
    public String hello() {
        return "hello";
    }

    @ResponseBody
    @RequestMapping(value="/hello/dto", method = RequestMethod.GET)
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

}
