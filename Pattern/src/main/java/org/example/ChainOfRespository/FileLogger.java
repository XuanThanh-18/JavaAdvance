package org.example.ChainOfRespository;

public class FileLogger extends Logger {
    @Override
    protected void write(String message) {
        System.out.println("Write to file " + message);
    }
}
