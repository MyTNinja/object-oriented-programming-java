/* Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two
 * methods to print the area and perimeter of the rectangle respectively. Its constructor
 * having parameters for length and breadth is used to initialize length and breadth of the
 * rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a
 * parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'.
 * Print the area and perimeter of a rectangle and a square.
 */

class RectangleA {
    int length;
    int breadth;

    RectangleA(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area: " + (length*breadth));
    }

    void perimeter() {
        System.out.println("perimeter: " + (2*(length + breadth)));
    }
}

class SquareA extends RectangleA {
    SquareA(int s) {
        super(s, s);
    }
}
public class AreaNPerimeter {
    public static void main(String[] args) {
        RectangleA obr = new RectangleA(5, 6);
        obr.area();
        obr.perimeter();

        SquareA obs = new SquareA(5);
        obs.area();
        obs.perimeter();
    }

}
