package com.csi.controllerfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ControllerApplication {

    @GetMapping
    public String sayHello() {
        return "Hello Akshay";
    }

    @GetMapping("/a1")
    public String me() {
        return "AKSHAY PARDESHI..!";
    }


}
