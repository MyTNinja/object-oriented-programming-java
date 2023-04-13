import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingCalc {
    String expression = "";
    public void create() {
        JFrame f = new JFrame("Calculator");
        f.setSize(300, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        JTextField result = new JTextField();

        result.setHorizontalAlignment(JTextField.RIGHT);
        result.setText("|");
        result.setEditable(false);

        f.add(result, BorderLayout.NORTH);

        String[] buttons = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "CLR", "0", "=", "+"};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton button = new JButton(buttons[i * 4 + j]);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String label = button.getText();
                        switch(label) {
                            case "CLR" -> {
                                expression = "";
                                result.setText("|");
                            }
                            case "=" -> {
                                String r = calculate(expression);
                                result.setText(r);
                            }
                            default -> {
                                expression += label;
                                result.setText(expression);
                            }
                        }
                    }
                });
                panel.add(button);
            }
        }

        f.add(panel, BorderLayout.CENTER);
        f.setVisible(true);
    }
    public String calculate(String exp) {
        if (exp.length() == 0) {
            expression = "";
            return "Equals...";
        }
        else {
            if(!CheckOperand(exp.charAt(0)))
                return "Meth";

            int res = value(exp.charAt(0));
            for (int i = 1; i < exp.length(); i += 2) {
                char operator = exp.charAt(i);
                if(i+1>=exp.length())
                    return "One more number";
                char operand = exp.charAt(i + 1);
                if (!CheckOperand(operand))
                    return "Bruh.";
                if (operator == '+')
                    res += value(operand);
                else if (operator == '-')
                    res -= value(operand);
                else if (operator == '*')
                    res *= value(operand);
                else if (operator == '/')
                    res /= value(operand);
                else
                    return "How did you even come here?";
            }
            expression = "";
            return String.valueOf(res);
        }
    }
    public int value(char c) {
        return c - '0';
    }
    public boolean CheckOperand(char c) {
        return (c >= '0' && c <= '9');
    }
    public static void main(String[] args) {
        SwingCalc ob = new SwingCalc();
        ob.create();
    }
}