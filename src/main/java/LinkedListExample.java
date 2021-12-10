import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList states = new LinkedList();
        states.add("Nairobi");
        states.add("Kiambu");
        states.add("Kisii");
        states.add("Kajiado");
        states.add("Kisumu");
        states.add("Mombasa");

        states.addFirst("Nakuru");
        System.out.println(states);
        System.out.println("Last state in my list: " + states.getLast());

        ListIterator iterator = states.listIterator(states.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
