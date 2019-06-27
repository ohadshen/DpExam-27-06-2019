package Ex5;

public class ErrorLogBuilder implements ILogBuilder {

    @Override
    public ILogger build() {
        return new WriteLogToFile(new BasicLogger());
    }
}
