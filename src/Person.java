public class Person {
    private String name;
    private String lastName;
    private int numberTickets;
    public Person(String name, String lastName, int numberTickets) {
        this.name = name;
        this.lastName = lastName;
        this.numberTickets = numberTickets;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberTickets() {
        return numberTickets;
    }

    public void consumptionTicket() {
        numberTickets -= 1;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " прокатился на аттракционе! Осталось билетов - " + numberTickets;
    }
}
