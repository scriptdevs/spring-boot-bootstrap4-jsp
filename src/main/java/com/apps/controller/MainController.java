package com.apps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    /**
     * Returns a simple page
     */
    @GetMapping("/")
    public String getPage() {
        //relates to index.jsp
        return "index";
    }

}
