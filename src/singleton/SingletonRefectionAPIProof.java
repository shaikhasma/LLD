package singleton;

import java.lang.reflect.Constructor;

public class SingletonRefectionAPIProof {
    //1st time true 2nd time onwards false used for Reflection API Proof,
    // and Multi-Thread double check.
    private static boolean isNew = true;
    private static SingletonRefectionAPIProof instance = null;

    private SingletonRefectionAPIProof() {
        if (isNew) {
            isNew = false;
        } else {
            System.out.println("This is singleton class..");
            throw new InstantiationError("Cannot Create Multiple Objects");
        }
    }

    public static SingletonRefectionAPIProof getInstance() {
        if (instance == null) {
            instance = new SingletonRefectionAPIProof();
        }
        return instance;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        SingletonRefectionAPIProof object = SingletonRefectionAPIProof.getInstance();
        SingletonRefectionAPIProof object1 = SingletonRefectionAPIProof.getInstance();
        System.out.println(object.hashCode() + " " + object1.hashCode());

        SingletonRefectionAPIProof object2 = null;
        try {
            Constructor[] constructors =
                    SingletonRefectionAPIProof.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                object2 = (SingletonRefectionAPIProof) constructor.newInstance();
                break;
            } System.out.println(object.hashCode() + " " + object2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (object2 == null) {
            System.out.println("Could not create object ");
        }
    }
}

//Object,  Class.fromName(jdbc)