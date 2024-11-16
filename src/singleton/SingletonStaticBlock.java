package singleton;

public class SingletonStaticBlock {
    private static SingletonStaticBlock instance;

    static int i = 10;

    private SingletonStaticBlock() { }

    static
    {
        System.out.println("----------");
        instance = new SingletonStaticBlock();
    }

    public final static SingletonStaticBlock getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        //SingletonStaticBlock object1 = SingletonStaticBlock.getInstance();
       // SingletonStaticBlock object2 = SingletonStaticBlock.getInstance();
       // System.out.println("Hash Code= " + object1.hashCode());
       // System.out.println("Hash Code= " + object2.hashCode());


        System.out.println("static = "+ SingletonStaticBlock.i);
    }
}
