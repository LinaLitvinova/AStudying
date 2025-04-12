package Transport;

public class Tanker extends Transport implements HasAPropeller, HasCargo{
    @Override
    public void propeller(){
        System.out.print("has a propeller ");
    }

    @Override
    public void cargo(){
        System.out.println("and can carry a cargo");
    }
}
