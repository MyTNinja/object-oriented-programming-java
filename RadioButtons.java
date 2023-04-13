import javax.swing.*;
public class RadioButtons {
    public static void main(String args[]) {
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton r1=new JRadioButton("IT");
        r1.setBounds(50,50,100,30);

        JRadioButton r2=new JRadioButton("CSE");
        r2.setBounds(50,100,100,30);

        JRadioButton r3=new JRadioButton("ECE");
        r3.setBounds(50,150,100,30);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        f.add(r1);
        f.add(r2);
        f.add(r3);

        f.setSize(200,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
