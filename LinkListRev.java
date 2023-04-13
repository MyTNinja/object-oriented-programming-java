import java.util.*;

public class LinkListRev {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("Orange");

        System.out.println("Originl List: " + list);

        Iterator<String> i = list.descendingIterator();

        System.out.print("Reverse List: ");
        while(i.hasNext()) {
            System.out.print(i.next() + ", ");
        }
    }
}
