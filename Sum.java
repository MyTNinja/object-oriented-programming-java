/*
Write a Java program to take input for two integer numbers from the user and add them. 
*/

import java.util.*;


public class Sum{
    public static void main(String args[]){
        System.out.println("-----Enter Two Numbers-----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();
        System.out.println("Sum: " + (num1+num2));
        sc.close();
    }
}