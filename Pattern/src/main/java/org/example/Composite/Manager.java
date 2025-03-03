package org.example.Composite;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Manager{
    private String name;
    private List<Developer> developers;

    public void AdjustSalary(int salary){
        developers.forEach(d->{
            d.setSalary(d.getSalary()+salary);
        });
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void showInfo(){
        System.out.println("Manager name: "+name);
        for(Developer developer:developers){
            developer.showDetail();
        }
    }
}
