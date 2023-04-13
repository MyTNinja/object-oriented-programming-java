/*
Write a Java program to swap two numbers. 
*/

import java.util.*;


public class Swap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number_1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number_2: ");
        int num2 = sc.nextInt();

        System.out.println("Before Swap: ");
        System.out.println(num1 + "\t" + num2);

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap: ");
        System.out.println(num1 + "\t" + num2);
        
    }
}