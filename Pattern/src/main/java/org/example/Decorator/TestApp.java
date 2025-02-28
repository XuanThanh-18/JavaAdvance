package org.example.Decorator;

public class TestApp {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        // show info
        System.out.println(coffee.getDescription() +"Gia: " + coffee.getPrice());
        // tao ca phe duong
        Coffee surgar = new SurgarDecorator(coffee);
        System.out.println(surgar.getDescription() +"Gia: " + surgar.getPrice());

        Coffee milk = new MilkDecorator(coffee);
        System.out.println(milk.getDescription() +"Gia: " + milk.getPrice());
    }
}

