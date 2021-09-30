package ca.sheridan.ramchrav.thymeleafpractice.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course implements Serializable {
    private Long id;
    private String prefix;
    private String code;
    private String name;

}
