public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance()");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton can't be cloned");
    }

    // Prevent new object during deserialization
    protected Object readResolve() {
        return getInstance();
    }
}
