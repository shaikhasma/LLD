package singleton;

class MyThread extends Thread{
    public void run(){
        SingletonSynchronizedMethod object1=SingletonSynchronizedMethod.getInstance();
        System.out.println("Hash Code= "+object1.hashCode());
    }
}
 class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod instance;

    private SingletonSynchronizedMethod() {}

    // Only one thread can execute this at a time
    public static final  SingletonSynchronizedMethod getInstance()
    {
        if (instance==null)
            instance = new SingletonSynchronizedMethod();
        return instance;
    }
    public static void xyz(){

    }
    public static void main(String[] args) {
        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();
        thread1.start();
        thread2.start();
    }
}

//t1 aquire lock
// t2
