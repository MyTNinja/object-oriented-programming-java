import java.util.*;
public class ArrayListEg {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<>();

        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println("Original: " + list_Strings);

        List<String> sub_list = list_Strings.subList(0, 3);
        System.out.println("List of first three elements: " + sub_list);
    }
}
