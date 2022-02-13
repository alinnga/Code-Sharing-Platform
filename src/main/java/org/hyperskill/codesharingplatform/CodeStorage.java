package org.hyperskill.codesharingplatform;

import org.hyperskill.codesharingplatform.entities.Code;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CodeStorage {

    private Map<Integer, Code> snippets;
    int idGenerator = 0;

    CodeStorage(){
        snippets = new HashMap<>();
    }

    public Code getSnippetById(int id){

        return snippets.get(id);
    }

    public void setCode(Code code){
        code.setDate(DateFormatter.format(LocalDateTime.now()));
        code.setLocalDate(LocalDateTime.now());
        snippets.put(++idGenerator, code);
    }

    public int getLatestId(){
        return idGenerator;
    }

    public Map<Integer, Code> getSnippets() {
        return snippets;
    }
    public List<Code> get10Latest() {
        return snippets.values().stream()
                .sorted()
                .limit(10).collect(Collectors.toList());
    }
}
