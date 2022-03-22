package org.hyperskill.codesharingplatform.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Code implements Comparable<Code>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long id;

    @JsonProperty("code")
    @Lob
    private String content;

    @JsonIgnore
    private LocalDateTime localDate;

    private String date;

    @Override
    public int compareTo(Code code) {

        return -this.getLocalDate().compareTo(code.getLocalDate());
    }

}
