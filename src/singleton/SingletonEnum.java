package singleton;

enum EnumInstance {
    INSTANCE;
    EnumInstance() {
    }
}

public class SingletonEnum {
    public static void main(String[] args) {
        EnumInstance object1 = EnumInstance.INSTANCE;
        EnumInstance object2 = EnumInstance.INSTANCE;
        System.out.println("Hash Code = " + object1.hashCode());
        System.out.println("Hash Code = " + object2.hashCode());

    }
}
