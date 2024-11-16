package singleton;

public class SingletonLazyInitialization {
    private static SingletonLazyInitialization singleton = null;

    private SingletonLazyInitialization() {
    }

    public static SingletonLazyInitialization getInstance() {
        if (singleton == null) {
            singleton = new SingletonLazyInitialization();
        }
        return singleton;
    }

    public static void main(String[] args) {
        SingletonLazyInitialization SingletonLazyInitializationDemo1 = SingletonLazyInitialization.getInstance();
        System.out.println(SingletonLazyInitializationDemo1.hashCode());
        SingletonLazyInitialization SingletonLazyInitializationDemo2 = SingletonLazyInitialization.getInstance();
        System.out.println(SingletonLazyInitializationDemo2.hashCode());
    }
}