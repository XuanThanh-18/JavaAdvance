package org.example.ChainOfRespository;

public abstract class Logger {
    protected Logger nextLogger;

    private boolean canHandle = true;
    protected abstract void write(String message);
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(String message) {
        if(canHandle) {
            canHandle = false;
           write( message );
        } else
        if(nextLogger != null) {
            nextLogger.logMessage(message);
        }
    }

}
