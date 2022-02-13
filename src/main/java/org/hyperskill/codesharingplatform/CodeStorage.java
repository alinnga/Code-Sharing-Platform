package org.hyperskill.codesharingplatform;

import org.hyperskill.codesharingplatform.entities.Code;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CodeStorage {

    private Code code;

    public CodeStorage() {
        String codeStr = "default value";
        LocalDateTime currentDate = LocalDateTime.now();
        code = new Code(codeStr,currentDate, DateFormatter.format(currentDate));
    }

    public Code getCode(){

        return code;
    }

    public void setCode(Code code){
        this.code.setContent(code.getContent());
        this.code.setLocalDate(LocalDateTime.now());
        this.code.setDate(DateFormatter.format(LocalDateTime.now()));
    }
}
