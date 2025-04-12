package Transport;

public class Helicopter extends Transport implements HasAPropeller, HasWheels, HasCargo {
    @Override
    public void propeller() {
        System.out.print("has a propeller, ");
    }

    @Override
    public void wheels() {
        System.out.print("has wheels, ");
    }

    @Override
    public void cargo() {
        System.out.println("also can cary a cargo");
    }
}