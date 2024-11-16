package singleton;

public class SingletonBillPugh {
    private SingletonBillPugh() {
    }

    private static class BillPughHelper {
        private static final SingletonBillPugh instance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return BillPughHelper.instance;
    }

    public static void main(String[] args) {
        SingletonBillPugh object1 = getInstance();
        SingletonBillPugh object2 = getInstance();
        System.out.println("Hash Code= " + object1.hashCode());
        System.out.println("Hash Code= " + object2.hashCode());
    }
}

// Note - Lazy Initiatliztion

