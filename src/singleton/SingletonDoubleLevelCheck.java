package singleton;

public class SingletonDoubleLevelCheck {
    private static SingletonDoubleLevelCheck instance;

    private SingletonDoubleLevelCheck () { }
 // object ready by t1
    private static SingletonDoubleLevelCheck getInstance () {
        if (instance == null) { // t1 t2
            synchronized (SingletonDoubleLevelCheck.class) { // lock is aquire by t2
                if (instance == null) {
                    instance = new SingletonDoubleLevelCheck();
                }
            } // release lock by t1
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("Hashcode object=" + getInstance().hashCode());
        System.out.println("Hashcode object=" + getInstance().hashCode());
    }
}
