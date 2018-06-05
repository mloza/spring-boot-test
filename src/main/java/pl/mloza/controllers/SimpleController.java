package pl.mloza.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.mloza.services.HelloService;

@Controller
public class SimpleController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello!";
    }

    @RequestMapping("/helloworld")
    @ResponseBody
    public String helloWorld() {
        return "Hello " + helloService.getHello() + "!";
    }
}
