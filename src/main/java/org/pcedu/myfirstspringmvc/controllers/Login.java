/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pcedu.myfirstspringmvc.controllers;

import java.lang.annotation.Annotation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.stereotype.Controller;  
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.bind.annotation.RequestMapping;  

/**
 *
 * @author George.Pasparakis
 */
//@Controller
public class Login extends AbstractController {
    
    public Login() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        ModelAndView model = new ModelAndView("login");
        model.addObject("method", request.getMethod());
        return model;
    }
    
//    @RequestMapping("/login.html")
    public String login() {
        return("login");
    }

    
}
