/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pcedu.myfirstspringmvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author George.Pasparakis
 */

public class Hello implements Controller {
    
    public Hello() {
    }
    
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) 
            throws Exception {
        
        
        ModelAndView model = new ModelAndView("hello"); // view 
        model.addObject("aName", "Coding Bootcamp 12 - Full Time Java!!!"); // as many objects setAttribute
        model.addObject("method", request.getMethod());
        return model;
    }
}
