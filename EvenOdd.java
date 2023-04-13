/*
Write a Java program to check if entered number is odd or even.
*/

import java.util.*;


public class EvenOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println((num%2)==0?"Even":"Odd");
    }
}