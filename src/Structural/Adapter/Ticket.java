package Structural.Adapter;

// Адаптер между пассажиром и самолетом
public class Ticket extends Plane {
    private Passenger passenger;

    public Ticket(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public void fly() {
        passenger.getOnPlane();
        super.fly();
    }
}
