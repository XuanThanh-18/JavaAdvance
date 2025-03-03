package org.example.State;

public class NoCoinState implements State{
    @Override
    public void insertCoint(VenderMachine machine) {
        System.out.println("Coint is inserted. you can press the button new");
        // ca=hangr to has coin state
        //TODO
    }

    @Override
    public void pressButton(VenderMachine machine) {
        System.out.println("Please insert coint first");
    }

    @Override
    public void despense(VenderMachine machine) {
        System.out.println("You despense ");
    }
}
