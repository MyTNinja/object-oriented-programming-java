/*
Write a Java program to check whether an alphabet is vowel or consonant. 
*/

import java.util.*;

public class Vowel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an alphabet: ");
        char alpha = sc.next().charAt(0);
        alpha = Character.toLowerCase(alpha);
        
        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o'|| alpha == 'u') System.out.println("Vowel");
        else System.out.println("Consonant");
    }
}