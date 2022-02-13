package org.hyperskill.codesharingplatform.controllers;

import org.hyperskill.codesharingplatform.CodeStorage;
import org.hyperskill.codesharingplatform.entities.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/code")
public class ControllerApi{

    @Autowired
    CodeStorage codeStorage;

    @GetMapping
    public Code getCode(){

        return codeStorage.getCode();
    }

    @PostMapping("/new")
    public Map<String, String> createCode(@RequestBody Code code){

        codeStorage.setCode(code);
        return new HashMap<>();
    }

}
