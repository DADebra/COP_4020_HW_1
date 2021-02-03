package org.helloworldpack;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping("/")
    public static String rootpage() {
        return "Hello Darin!";
    }
}
