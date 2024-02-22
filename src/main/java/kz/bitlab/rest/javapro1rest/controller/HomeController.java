package kz.bitlab.rest.javapro1rest.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping(value = "/")
    public String indexPage(){
        return "index";
    }
}
