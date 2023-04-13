import java.util.*;
public class SwapArrayList {
    public static void main(String[] args) {
        List<String> ArrList = new ArrayList<>();

        ArrList.add("Item 1");
        ArrList.add("Item 2");
        ArrList.add("Item 3");
        ArrList.add("Item 4");
        ArrList.add("Item 5");

        System.out.println("Befre Swap: " + ArrList);

        Collections.swap(ArrList, 1, 2);
        System.out.println("After Swap: " + ArrList);
    }
}
