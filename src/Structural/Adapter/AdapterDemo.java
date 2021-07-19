package Structural.Adapter;

// Паттерн проектирования Adapter
// Позволяет объектам с не совместимыми интерфейсами
// работать вместе
public class AdapterDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(new Passenger());
        ticket.fly();
    }
}
