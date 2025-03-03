package org.example.ChainOfRespository;

public class AppTest {
    public static void main(String[] args) {
        Logger DBLogger = new DBLogger();
        Logger FileLogger = new FileLogger();
        Logger ConLogger = new ConsoleLogger();

        DBLogger.nextLogger = FileLogger;
        FileLogger.nextLogger = ConLogger;

        DBLogger.logMessage("this is log message");
        DBLogger.logMessage("this is log file");
        DBLogger.logMessage("this is log console");
    }
}
