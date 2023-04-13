/* Create a class named Order that performs order processing of a single item. The class have five
 * attributes: customer name, customer number, quantity ordered, unit price and total price. It has
 * method computePrice equals to the total price as quantity ordered*unit price and a method to
 * display the details. Write a class named Demo that instantiates object of this class. Read inputs from
 * the user and display the results
 */


import java.util.Scanner;

class Order {
    String customerName;
    int customerNumber;
    int quantityOrdered;
    int unitPrice;
    int totalPrice;

    Order(String name, int n, int q, int u) {
        customerName = name;
        customerNumber = n;
        quantityOrdered = q;
        unitPrice = u;
        totalPrice = 0;
    }

    void computePrice() {
        totalPrice = quantityOrdered*unitPrice;
    }

    void display() {
        System.out.println("\nName: " + customerName);
        System.out.println("Number: " + customerNumber);
        System.out.println("Quantity: " + quantityOrdered);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total: " + totalPrice);
    }
}
public class DemoSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name, number, quantity, and unit price: ");
        Order ob = new Order(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        ob.computePrice();
        ob.display();
    }
}
