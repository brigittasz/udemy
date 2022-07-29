package x49;

public interface NodeList <T> {
    public abstract T getRoot();
    public abstract boolean addItem(T t);
    public abstract boolean removeItem(T t);
    public abstract void traverse(T t);
}
