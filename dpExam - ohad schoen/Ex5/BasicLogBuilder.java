package Ex5;

public class BasicLogBuilder implements ILogBuilder {
    @Override
    public ILogger build() {
        return new BasicLogger();
    }
}
