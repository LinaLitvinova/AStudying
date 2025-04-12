package Transport;

public class Truck extends Transport implements HasWheels, HasCargo{
    @Override
    public void wheels() {
        System.out.print("has wheels ");
    }

    @Override
    public void cargo() {
        System.out.println("and can carry a cargo");
    }
}
