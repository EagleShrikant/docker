package com.shri;

import org.springframework.boot.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @RequestMapping("/Docker")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
