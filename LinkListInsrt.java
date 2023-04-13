import java.util.*;

public class LinkListInsrt {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");

        System.out.println("Original List: " + list);

        list.add(1, "Yellow");
        System.out.println("After insertn: " + list);
    }
}
