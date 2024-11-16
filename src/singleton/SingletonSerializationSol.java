package singleton;

import java.io.*;

public class SingletonSerializationSol implements Serializable{
    private static SingletonSerializationSol instance;
    private SingletonSerializationSol() {
    }

    public static SingletonSerializationSol getInstance() {
        if (instance == null) {
            instance = new SingletonSerializationSol();
        }
        return instance;
    }

    //implement readResolve
   // protected Object readResolve() {
    //    return instance;
   // }

    public static void main(String[] args) {
        SingletonSerializationSol object1 = getInstance();
        System.out.println("Hash Code=" + object1.hashCode());
        try {
            ObjectOutput output = new ObjectOutputStream(new FileOutputStream("TestFile.txt"));
            output.writeObject(object1);
            output.close();
            //De-serialize
            ObjectInput input = new ObjectInputStream(new FileInputStream("TestFile.txt"));
            SingletonSerializationSol object2=(SingletonSerializationSol)input.readObject();
            System.out.println("Hash Code=" + object2.hashCode());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
