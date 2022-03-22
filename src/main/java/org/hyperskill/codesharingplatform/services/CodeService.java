package org.hyperskill.codesharingplatform.services;

import org.hyperskill.codesharingplatform.DateFormatter;
import org.hyperskill.codesharingplatform.entities.Code;
import org.hyperskill.codesharingplatform.exceptions.SnippetNotFoundException;
import org.hyperskill.codesharingplatform.repositories.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class CodeService {

    @Autowired
    private CodeRepository codeRepository;


    public Code getSnippetById(long id) throws SnippetNotFoundException {
        Optional<Code> maybeSnippet= codeRepository.findById(id);
        if(maybeSnippet.isPresent()){
            return maybeSnippet.get();
        }
        else{
            throw new SnippetNotFoundException("Snippet not found by id: "+id);
        }
    }

    public Map<String, String> setCode(Code code) {
        code.setDate(DateFormatter.format(LocalDateTime.now()));
        code.setLocalDate(LocalDateTime.now());
        Code savedCode = codeRepository.save(code);
        Map<String, String> idMap = new HashMap<>();
        idMap.put("id", savedCode.getId()+"");
        return idMap;
    }

    public List<Code> get10Latest() {
        List<Code> snippets = new ArrayList<>();
        codeRepository.findAll().forEach(snippets::add);
        return snippets.stream()
                .sorted()
                .limit(10).collect(Collectors.toList());
    }
}
