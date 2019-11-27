package com.sumutella.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sumutella
 * @time 3:03 PM
 * @since 11/27/2019, Wed
 */

@Controller
public class IndexController {


    @RequestMapping({"/", "", "index", "index.html"})
    public String showIndexPage(){
        return "index";
    }
}
