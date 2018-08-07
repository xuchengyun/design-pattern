package group.facede.one;

/**
 * Created by xuchengyun on 8/7/18.
 */
public class Facade {

    private Light l1;
    private Light l2;
    private Light l3;
    private Heater ht;
    private Television tv;

    public Facade() {
        l1 = new Light();
        l2 = new Light();
        l3 = new Light();
        ht = new Heater();
        tv = new Television();
    }

    public void open() {
        l1.open();
        l2.open();
        l3.open();
        ht.open();
        tv.open();
    }

    public static void main(String[] args) {
        Facade fc = new Facade();
        fc.open();
    }
}
