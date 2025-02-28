package org.example.Decorator;

public class CoffeeDecorator implements Coffee {
    protected Coffee Originalcoffee;
    public CoffeeDecorator(Coffee coffee) {
        this.Originalcoffee = coffee;
    }
    @Override
    public String getDescription() {
        return Originalcoffee.getDescription();
    }

    @Override
    public double getPrice() {
        return Originalcoffee.getPrice();
    }
}
