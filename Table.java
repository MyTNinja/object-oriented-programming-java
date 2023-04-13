import javax.swing.*;
import java.awt.*;
public class Table {
    public static void main(String[] args) {
        JFrame f = new JFrame("Is Table");
        f.setLayout(new GridLayout(3, 3));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] data = {"Heading", "Also Heading", "Again",
                "Mango", "Apple", "Orange",
                "Yellow", "Red", "Orange"};

        for (int i = 0; i<9; i++) {
            JLabel label = new JLabel(data[i], SwingConstants.CENTER);
            f.add(label);
        }

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
