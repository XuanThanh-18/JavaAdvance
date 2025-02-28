package org.example.Composite;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Developer implements Employee{
    private String name;
    private int age;
    private int salary;
    @Override
    public void showDetail() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age   );
        System.out.println("Salary: " + salary);
    }
}
