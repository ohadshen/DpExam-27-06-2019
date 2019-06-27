package Ex5;

public class WriteLogToFile extends LoggerDecorator {

    public WriteLogToFile(ILogger iLogger) {
        super(iLogger);
    }

    @Override
    public void updateLog(String logMessage) {
        System.out.println("log was written to file");
        this.iLogger.updateLog(logMessage);
    }
}
