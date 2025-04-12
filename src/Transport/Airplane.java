package Transport;

public class Airplane extends Transport implements HasAPropeller, HasWheels, HasWings, HasCargo{
    @Override
    public void propeller(){
        System.out.print("has a propeller ");
    }

    @Override
    public void wheels() {
        System.out.print("has wheels, ");
    }

    @Override
    public void wings() {
        System.out.print("has wings, ");
    }

    @Override
    public void cargo() {
        System.out.println("and it can carry a cargo");
    }
}
