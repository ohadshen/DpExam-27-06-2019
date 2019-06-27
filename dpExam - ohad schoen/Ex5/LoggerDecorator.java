package Ex5;

public abstract class LoggerDecorator implements ILogger{
    ILogger iLogger;

    public LoggerDecorator(ILogger iLogger) {
        this.iLogger = iLogger;
    }
}
