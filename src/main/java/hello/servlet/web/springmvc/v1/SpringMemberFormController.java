package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMemberFormController {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process(){
        System.out.println("SpringMemberFormController.process");
        return new ModelAndView("new-form");
    }
}