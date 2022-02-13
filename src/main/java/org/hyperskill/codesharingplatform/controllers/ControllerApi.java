package org.hyperskill.codesharingplatform.controllers;

import org.hyperskill.codesharingplatform.CodeStorage;
import org.hyperskill.codesharingplatform.entities.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/code")
public class ControllerApi{

    @Autowired
    CodeStorage codeStorage;

    @GetMapping("/{id}")
    public Code getCode(@PathVariable int id){

        return codeStorage.getSnippetById(id);
    }

    @PostMapping("/new")
    public Map<String, String> createCode(@RequestBody Code code){

        codeStorage.setCode(code);
        Map<String, String> result = new HashMap<>();
        result.put("id", codeStorage.getLatestId()+"");
        return result;
    }

    @GetMapping("/latest")
    public List<Code> get10LatestSnippets(){

        return codeStorage.get10Latest();
    }

}
