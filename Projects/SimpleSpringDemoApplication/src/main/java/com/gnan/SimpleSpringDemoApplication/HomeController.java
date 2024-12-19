package com.gnan.SimpleSpringDemoApplication;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller//-along with @responseboby data will be returned otherwise ! ctrller will search for 
//file(/ or /about fies)
@RestController//-is uesd to return data

public class HomeController
{
    @RequestMapping("/")
    //@ResponseBody//for returning data instead of web pages
    public String greet()
    {
        return "Welcome GnaneshNadh ";//return web page in the form of .json file
    }

    @RequestMapping("/about")//request for about mtd this about can be same or diff
    public String about()
    {
        return "We dont teach, We Educate!!";
    }
}



/*
http://localhost:8080/
Welcome GnaneshNadh

http://localhost:8080/about
We dont teach, We Educate!!

 */