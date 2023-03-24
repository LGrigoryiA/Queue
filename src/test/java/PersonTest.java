import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person("Петя", "Петров", 6);

    @Test
    void pay() {
        person.pay();
        int expected = person.getNumberTickets();
        int actual = 5;
        assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        String expected = person.toString();
        String actual = "Петя Петров прокатился на аттракционе осталось билетов 6";
        assertEquals(expected, actual);
    }

    @Test
    void getNumberTickets() {
        int expected = person.getNumberTickets();
        int actual = 6;
        assertEquals(expected, actual);
    }
}