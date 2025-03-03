package org.example.ChainOfRespository;

public class ConsoleLogger extends Logger {

    @Override
    protected void write(String message) {
        System.out.println("Write to consloe " + message);
    }
}
