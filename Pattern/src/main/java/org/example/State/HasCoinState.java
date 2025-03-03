package org.example.State;

public class HasCoinState implements State{
    @Override
    public void insertCoint(VenderMachine machine) {
        System.out.println("Coin already inserted. You can press the button to get product");
    }

    @Override
    public void pressButton(VenderMachine machine) {
        System.out.println("Button pressed. Depending product,....");
        //TODO: changr to DISPENSDINGSTATE
    }

    @Override
    public void despense(VenderMachine machine) {
        System.out.println("Press the button to dispens the product");
    }
}
