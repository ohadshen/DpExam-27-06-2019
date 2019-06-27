package Ex5;

public class BasicLogger implements ILogger {
    @Override
    public void updateLog(String logMessage) {
        System.out.println(logMessage);
    }
}
