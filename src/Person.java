public class Person {
    protected String name;
    protected String lastName;
    protected int numberTickets;

    public Person(String name, String lastName, int numberTickets) {
        this.name = name;
        this.lastName = lastName;
        this.numberTickets = numberTickets;
    }

    public void pay() {
        this.numberTickets--;
    }

    @Override
    public String toString() {
        return name + " " + lastName + " " + "прокатился на аттракционе осталось билетов " + numberTickets;
    }

    public int getNumberTickets() {
        return numberTickets;
    }
}

