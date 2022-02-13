package org.hyperskill.codesharingplatform.controllers;

import org.hyperskill.codesharingplatform.CodeStorage;
import org.hyperskill.codesharingplatform.entities.Code;
import org.hyperskill.codesharingplatform.DateFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerWeb {

    @Autowired
    CodeStorage codeStorage;

    @Autowired
    DateFormatter formatter;

    @GetMapping("/code")
    public String getHtmlPage(Model model){
        Code code = codeStorage.getCode();
        model.addAttribute("code", code);
        return "getCode";
    }

    @GetMapping("/code/new")
    public String createCode(){
        return "newCode";
    }


}