package com.tominsivu.boots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ttoiviainen on 20/04/17.
 */

@Controller
public class GreetingController {

    @RequestMapping(path = "/greeting", method = RequestMethod.GET)
    public String greeting (@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
