import java.io.*;

class Student {
    String names;
    String dob;
    int roll;

    InputStreamReader r= new InputStreamReader(System.in);    
    BufferedReader br= new BufferedReader(r);

    Student() {
        names = "";
        dob = "";
        roll = 0;
    }

    public void inputdata() throws IOException{
        System.out.println("Enter Name, Date of Birth and Roll No.: ");
        names = br.readLine();
        dob = br.readLine();
        roll = Integer.parseInt(br.readLine());
    }

    public void printdata() {
        System.out.println("\nName:\t\t" + names);
        System.out.println("Date of Birth:\t" + dob);
        System.out.println("Roll No.:\t" + roll);
    }
}

class Mark extends Student {
    float p, c, m, cts, e;
    float tot, per;
    char gd;

    public void readdata() throws NumberFormatException, IOException {
        System.out.println("\nEnter marks for Physics, Chemistry, Maths, Computer Science, English: ");
        p = Float.parseFloat(br.readLine());
        c = Float.parseFloat(br.readLine());
        m = Float.parseFloat(br.readLine());
        cts = Float.parseFloat(br.readLine());
        e = Float.parseFloat(br.readLine());
    }

    public void compute() {
        tot = p + c + m + cts + e;
        per = (float) (tot/5.0);

        if(per >= 90) {
            gd = 'A';
        }
        else if(per >= 60 && per < 90) {
            gd = 'B';
        }
        else if(per >= 40 && per < 60) {
            gd = 'C';
        }
        else {
            gd = 'D';
        }
    }

    public void showdata() {
        System.out.println("\nMarks for: ");
        System.out.println("Physics:\t\t" + p);
        System.out.println("Chemistry:\t\t" + c);
        System.out.println("Maths:\t\t\t" + m);
        System.out.println("Computer Science:\t" + cts);
        System.out.println("English:\t\t" + e);
        System.out.println("\nTotal:\t" + tot);
        System.out.println("Percentage:\t" + per);
        System.out.println("Grade:\t" + gd);
    }
}

public class StudentMarks {
    public static void main(String[] args) throws IOException {
        Mark obj = new Mark();
        obj.inputdata();
        obj.printdata();
        obj.readdata();
        obj.compute();
        obj.showdata();
    }
}