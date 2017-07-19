package cn.edu.whu.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Fly on 2017/7/19.
 */
@Controller
public class DefaultController {
    @RequestMapping("/")
    public ModelAndView defaultView(){
        return new ModelAndView("redirect:books");
    }
}
