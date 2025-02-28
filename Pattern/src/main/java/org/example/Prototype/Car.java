package org.example.Prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.text.Style;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car implements Cloneable {
    private String color;
    private String model;
    private String style;



    @Override
    protected Car clone() {
        return Car.builder().color(this.color).style(this.style).model(this.model).build();
    }


    public void Print() {
        System.out.println("Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", style='" + style + '\'' +
                '}');
    }
}
