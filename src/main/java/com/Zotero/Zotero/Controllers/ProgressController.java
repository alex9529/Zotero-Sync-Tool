package com.Zotero.Zotero.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class ProgressController {



    @GetMapping("/progress")
    public String library( Model model, RestTemplate restTemplate, @RequestParam(name = "id", required = false, defaultValue = "") String id) {


        model.addAttribute("id", id);


        return "progress";


    }
}
