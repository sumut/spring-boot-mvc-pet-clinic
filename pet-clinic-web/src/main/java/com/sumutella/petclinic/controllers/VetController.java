package com.sumutella.petclinic.controllers;

import com.sumutella.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sumutella
 * @time 3:26 PM
 * @since 11/27/2019, Wed
 */
@RequestMapping({"/vets", "/vets.html"})
@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/", "/index", "/index.html" })
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
