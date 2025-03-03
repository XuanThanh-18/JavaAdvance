package org.example.Template;

public class Tea extends HotBeverage{
    @Override
    public void brew() {
        System.out.println("Steping the tea....");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon...");
    }
}
