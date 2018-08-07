package group.singleton.one;

/**
 * Created by xuchengyun on 8/6/18.
 */
public class Singleton {


    // volatile can keep multiple threads to access the same memory
    private volatile static Singleton singleton;

    private Singleton() {};

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

class Main {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        System.out.println(a);
        Singleton b = Singleton.getInstance();
        System.out.println(b);
    }
}


