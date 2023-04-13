import java.util.Scanner;

class StudentDetail {
    private String name;
    private String roll;
    private int age;

    public void setDetails(String n, String r, int a) {
        name =  n;
        roll = r;
        age = a;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDetail ob = new StudentDetail();

        System.out.println("Enter your name, rollno, age: ");
        ob.setDetails(sc.next(), sc.next(), sc.nextInt());

        System.out.print("\nName: " + ob.getName());
        System.out.print("\nRoll No.: " + ob.getRoll());
        System.out.print("\nAge: " + ob.getAge());

    }
}
