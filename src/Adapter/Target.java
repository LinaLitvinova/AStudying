package Adapter;

public interface Target {
    void request();
}

class Adaptee {
    public void specificRequest() {
        System.out.println("Specific request");
    }
}

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest():
    }
}

public class AdapterPetternDemo {
    public static void main(String [] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adaptee(adaptee);
        target.request();
    }
}
