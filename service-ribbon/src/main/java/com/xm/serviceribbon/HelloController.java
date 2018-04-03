package com.xm.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Autowired
    HelloService helloService;

    @Value("${jdbc.username}")
    String userName;

    @RequestMapping(name = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name)+" - "+userName;
    }

}
