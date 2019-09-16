import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @Test
    void testExpectedException() {

        Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });
    }

    @Test
    void addFirst() {

        CP3LinkedList<Integer> list = new CP3LinkedList<>();
        list.addFirst(5);

        int actual = list.getFirst();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void getFirst() {
        CP3LinkedList<Integer> list = new CP3LinkedList<>();

        Assertions.assertThrows(NoSuchElementException.class, () ->
        {
            list.getFirst();
        });

        list.addFirst(5);

        int actual = list.getFirst();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void removeFirst() {
        CP3LinkedList<Integer> list = new CP3LinkedList<>();

        Assertions.assertThrows(NoSuchElementException.class, () ->
        {
            list.getFirst();
        });

        list.addFirst(5);
        list.addFirst(7);

        int actual = list.removeFirst();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        CP3LinkedList<String> list = new CP3LinkedList<>();

        boolean actual = list.isEmpty();
        boolean expected = true;

        assertEquals(expected, actual);

        list.addFirst("Yeet");
        list.addFirst("Yote");

        actual = list.isEmpty();
        expected = false;

        assertEquals(expected, actual);
    }

    @Test
    void print() {

    }

    @Test
    void size() {
        CP3LinkedList<String> list = new CP3LinkedList<>();

        int actual = list.size();
        int expected = 0;

        assertEquals(expected, actual);

        list.addFirst("sfg");
        list.addFirst("sfs");

        actual = list.size();
        expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void addLast() {
        CP3LinkedList<Integer> list = new CP3LinkedList<>();

        Assertions.assertThrows(NoSuchElementException.class, () ->
        {
            list.getFirst();
        });

        list.addLast(5);
        list.addLast(7);

        int actual = list.getFirst();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void getLast() {
    }
}