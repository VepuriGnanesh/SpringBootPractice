package com.gnan.SimpleSpringDemoApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/Login")//loginrequest for controller
    public String login()
    {
        return "Login page!!!";
    }
}


/*
we can create multiple controllers and run in parallel
Login page!!!
 */