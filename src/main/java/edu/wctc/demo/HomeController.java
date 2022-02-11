package edu.wctc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    @RequestMapping("/step-one")
    public String showStepOne(){
        return "pages/step-one";
    }

    @RequestMapping("/step-two")
    public String showStepTwo(){
        return "pages/step-two";
    }

    @RequestMapping("/step-three")
    public String showStepThree(){
        return "pages/step-three";
    }

}
