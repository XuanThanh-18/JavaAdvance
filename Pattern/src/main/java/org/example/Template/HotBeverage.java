package org.example.Template;

public abstract class HotBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourIntoCap();
        addCondiments();
    }
    //step 1
    public void boilWater(){
        System.out.println("Boiling Water....");
    }
    //step 2
    public abstract void brew();

    //step 3

    private void pourIntoCap(){
        System.out.println("Pouring into cap...");
    }

    //step 4
    public abstract void addCondiments();

}
