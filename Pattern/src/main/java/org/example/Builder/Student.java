package org.example.Builder;

import lombok.*;

@Builder
//@Getter
//@Setter
@AllArgsConstructor
@Data
public class Student {
    private String name;
    private int age;
    private String id;
}
