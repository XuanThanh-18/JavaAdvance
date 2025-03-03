package org.example.State;

public class DispensingState implements State{
    @Override
    public void insertCoint(VenderMachine machine) {
        System.out.println("Please wait, dispensing product...");
    }

    @Override
    public void pressButton(VenderMachine machine) {
        System.out.println("Already dispensing. please wait...");
    }

    @Override
    public void despense(VenderMachine machine) {
        System.out.printf("Product dispensing. return to initial state\n");
        //Todo: set init state
    }
}
