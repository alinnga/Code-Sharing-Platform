package org.hyperskill.codesharingplatform.controllers;

import org.hyperskill.codesharingplatform.entities.Code;
import org.hyperskill.codesharingplatform.DateFormatter;
import org.hyperskill.codesharingplatform.services.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/code")
public class ControllerWeb {

    @Autowired
    CodeService codeService;

    @Autowired
    DateFormatter formatter;

    @GetMapping("/{id}")
    public String getHtmlPage(@PathVariable int id, Model model){
        Code code = codeService.getSnippetById(id);
        model.addAttribute("snippets", List.of(code));
        return "getCode";
    }

    @GetMapping("/new")
    public String createCode(){
        return "newCode";
    }
    @GetMapping("/latest")
    public String get10LatestSnippets(Model model){
        model.addAttribute("snippets", codeService.get10Latest());
        return "getCode";
    }


}