

package com.codejava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class webController {

    @RequestMapping("/hello")
    public String sayHello()
    {
        System.out.println("Saying hello to all!!");
        return "hello";
    }
    
}
