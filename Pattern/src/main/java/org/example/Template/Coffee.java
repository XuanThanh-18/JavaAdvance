package org.example.Template;

import org.example.Decorator.CoffeeDecorator;

public class Coffee extends HotBeverage{
    @Override
    public void brew() {
        System.out.println("Drink Coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding surgar...");
    }
}
