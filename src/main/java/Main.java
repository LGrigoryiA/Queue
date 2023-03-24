import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = (Queue<Person>) generateClients();
        while (!queue.isEmpty()) {
            Person i = queue.poll();
            i.pay();
            if (i.getNumberTickets() != 0) {
                queue.offer(i);
            }
            System.out.println(i.toString());
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Olya", "Sidorova", 5));
        clients.add(new Person("Anya", "Petrova", 7));
        clients.add(new Person("Kolya", "Kozlov", 2));
        clients.add(new Person("Tolya", "Ivanov", 1));
        clients.add(new Person("Andrey", "Vodogrey", 12));
        return (List<Person>) clients;
    }


}


