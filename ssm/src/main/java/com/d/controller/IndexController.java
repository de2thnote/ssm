package com.d.controller;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
  
@Controller  
public class IndexController { 
	
    @RequestMapping("/")    
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        mav.addObject("user", "test");   
        return mav;    
    }    
} 