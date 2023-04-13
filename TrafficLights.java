import javax.swing.*;
import java.awt.*;

public class TrafficLights {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel s=new JPanel();
        s.setBounds(50, 100, 100, 100);
        s.setBackground(Color.GRAY);

        JPanel w=new JPanel();
        w.setBounds(200, 100, 100, 100);
        w.setBackground(Color.GRAY);

        JPanel g=new JPanel();
        g.setBounds(350, 100, 100, 100);
        g.setBackground(Color.GRAY);

        JButton S=new JButton("STOP");
        S.setBounds(50, 250, 100, 20);
        S.addActionListener(e -> {
            s.setBackground(Color.RED);
            w.setBackground(Color.GRAY);
            g.setBackground(Color.GRAY);
        });

        JButton W=new JButton("WAIT");
        W.setBounds(200, 250, 100, 20);
        W.addActionListener(e -> {
            s.setBackground(Color.GRAY);
            w.setBackground(Color.YELLOW);
            g.setBackground(Color.GRAY);
        });

        JButton G=new JButton("GO");
        G.setBounds(350, 250, 100, 20);
        G.addActionListener(e -> {
            s.setBackground(Color.GRAY);
            w.setBackground(Color.GRAY);
            g.setBackground(Color.GREEN);
        });

        JButton R=new JButton("RESET");
        R.setBounds(50, 30, 100, 20);
        R.addActionListener(e -> {
            s.setBackground(Color.GRAY);
            w.setBackground(Color.GRAY);
            g.setBackground(Color.GRAY);
        });

        f.add(s);
        f.add(w);
        f.add(g);

        f.add(S);
        f.add(W);
        f.add(G);

        f.add(R);

        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
