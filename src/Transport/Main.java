package Transport;

public class Main {
    public static void main (String [] args) {
        Airplane airplane = new Airplane();
        System.out.print("The Airplane: ");
        airplane.wheels();
        airplane.wings();
        airplane.propeller();
        airplane.cargo();
        Boat boat = new Boat();
        System.out.print("The Boat: ");
        boat.propeller();
        boat.cargo();
        Helicopter helicopter = new Helicopter();
        System.out.print("The Helicopter: ");
        helicopter.wheels();
        helicopter.propeller();
        helicopter.cargo();
        Tanker tanker = new Tanker();
        System.out.print("The Tanker: ");
        tanker.propeller();
        tanker.cargo();
        Taxi taxi = new Taxi();
        System.out.print("The Taxi: ");
        taxi.wheels();
        Truck truck = new Truck();
        System.out.print("The Truck: ");
        truck.wheels();
        truck.cargo();
    }
}
