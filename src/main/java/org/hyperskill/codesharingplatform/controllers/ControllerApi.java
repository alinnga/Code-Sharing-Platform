package org.hyperskill.codesharingplatform.controllers;

import org.hyperskill.codesharingplatform.entities.Code;
import org.hyperskill.codesharingplatform.services.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/code")
public class ControllerApi{

    @Autowired
    CodeService codeService;

    @GetMapping("/{id}")
    public Code getCode(@PathVariable long id){

        return codeService.getSnippetById(id);
    }

    @PostMapping("/new")
    public Map<String, String> createCode(@RequestBody Code code){

        return codeService.setCode(code);
    }

    @GetMapping("/latest")
    public List<Code> get10LatestSnippets(){

        return codeService.get10Latest();
    }

}
