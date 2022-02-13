package org.hyperskill.codesharingplatform.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Code implements Comparable<Code>{

    @JsonProperty("code")
    private String content;

    @JsonIgnore
    private LocalDateTime localDate;

    private String date;

    @Override
    public int compareTo(Code code) {
        return -this.getLocalDate().compareTo(code.getLocalDate());
    }

}
