package com.example.myproj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogController {

    @GetMapping("/catalog")
    public String catalog(Model model) {
        model.addAttribute("title", "Каталог");
        return "catalog";
    }

}
