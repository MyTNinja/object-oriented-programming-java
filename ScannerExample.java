/*
Program example for scanner class
*/

import java.util.*;


public class ScannerExample{
    public static void main(String args[]){
        System.out.println("-----Enter Your Details-----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Name: " + name);
        System.out.println("Enter your age: ");
        int i = sc.nextInt();
        System.out.println("Age: " + i);
        System.out.println("Enter your salary: ");
        double d = sc.nextDouble();
        System.out.println("Salary: " + d);
        sc.close();
    }
}