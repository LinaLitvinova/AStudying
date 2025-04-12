package Transport;

public class Taxi extends Transport implements HasWheels {
    @Override
    public void wheels() {
        System.out.println("has wheels");
    }
}
