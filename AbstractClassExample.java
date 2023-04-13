abstract class EmployeeA {
    abstract void display();
}

class FullTimeEmployee extends EmployeeA {
    char clss;

    FullTimeEmployee(char c) {
        clss = c;
    }

    void display() {
        switch (clss) {
            case 'A':
                System.out.println("Salary: 1000");
                break;

            case 'B':
                System.out.println("Salary: 500");
                break;

            default:
                System.out.println("Invalid Class");
                break;
        }
    }
}

class PartTimeEmployee extends EmployeeA {
    double hrs;
    int rate = 50;
    PartTimeEmployee(double h) {
        hrs = h;
    }

    void display() {
        System.out.println("Salary: " + hrs*rate);
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        FullTimeEmployee obf = new FullTimeEmployee('A');
        obf.display();

        PartTimeEmployee obp = new PartTimeEmployee(10);
        obp.display();
    }
}
