package Ex5;

public class FatalLogBuilder implements ILogBuilder {

    @Override
    public ILogger build() {
        return new SendSmsLog(new WriteLogToFile(new BasicLogger()));
    }
}
