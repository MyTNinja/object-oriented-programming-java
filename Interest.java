/*
Write a Java program that calculates and displays the amount of money you would have if you invested 10000 Rs at 5% interest for one year. 
Use the formula:    Future Amount = Principal*Rate*Time.
*/

public class Interest{
    public static void main(String args[]){
        double pr, rate, time;
        
        pr = 10000;
        rate = 5;
        time = 1;
        
        double si = pr*(rate/100)*time;
        System.out.println("Interest = " + si);
        System.out.println("Amount = " + (pr+si));
    }
}