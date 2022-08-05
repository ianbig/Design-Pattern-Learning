package FastFood;

public abstract class AbstractReader {
    protected abstract boolean validate();
    public abstract Order read(String filepath);
}
