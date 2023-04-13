import java.util.*;
public class CmpArrayList {
    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("Apple");
        firstList.add("Pears");
        firstList.add("Guava");
        firstList.add("Mango");
        System.out.println(firstList);

        List<String> secndList = new ArrayList<>();
        secndList.add("Apple");
        secndList.add("Pears");
        secndList.add("Guava");
        secndList.add("Mango");
        secndList.add("Black");
        System.out.println(secndList);

        boolean cmp = firstList.equals(secndList);
        System.out.println(cmp);
    }
}
