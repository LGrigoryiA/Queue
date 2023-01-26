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
        Person a = new Person("Olya", "Sidorova", 5);
        clients.add(a);
        Person b = new Person("Anya", "Petrova", 7);
        clients.add(b);
        Person c = new Person("Kolya", "Kozlov", 2);
        clients.add(c);
        Person d = new Person("Tolya", "Ivanov", 1);
        clients.add(d);
        Person e = new Person("Andrey", "Vodogrey", 12);
        clients.add(e);

        return (List<Person>) clients;
    }


}


