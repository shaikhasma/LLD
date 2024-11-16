package singleton;

public final class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() { }

    public static final EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton object1 = getInstance();
        EagerSingleton object2 = getInstance();
        System.out.println("Hash Code=" + object1.hashCode());
        System.out.println("Hash Code=" + object2.hashCode());
    }
}

// Eager

