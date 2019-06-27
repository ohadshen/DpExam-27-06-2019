package Ex5;

public class SendSmsLog extends LoggerDecorator {
    public SendSmsLog(ILogger iLogger) {
        super(iLogger);
    }

    @Override
    public void updateLog(String logMessage) {
        System.out.println("sms was sent");
        iLogger.updateLog(logMessage);
    }
}
