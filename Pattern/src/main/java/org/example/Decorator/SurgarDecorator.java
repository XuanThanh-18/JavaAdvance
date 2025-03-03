package org.example.Decorator;

public class SurgarDecorator extends CoffeeDecorator {
    public SurgarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +"Surgar";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10;
    }
}
