import java.util.Scanner;

class StudentName {
    String name;
    StudentName() {
        name = "Unknown";
    }

    StudentName(String str) {
        name = str;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class TwoConstructors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //object created without parameters (i.e. name)
        StudentName ob1 = new StudentName();
        ob1.display();

        //object created entering the name as parameter
        System.out.println("Enter name: ");
        StudentName ob2 = new StudentName(sc.next());
        ob2.display();
    }
}
