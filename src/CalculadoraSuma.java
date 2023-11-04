import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSuma {
    private JFrame frame;
    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField resultadoField;
    private JButton sumarButton;

    public CalculadoraSuma() {
        frame = new JFrame("Calculadora de Suma");
        frame.setLayout(new FlowLayout());

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultadoField = new JTextField(10);
        resultadoField.setEditable(false);

        sumarButton = new JButton("Sumar");

        sumarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double resultado = num1 + num2;
                    resultadoField.setText(Double.toString(resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese números válidos");
                }
            }
        });

        frame.add(num1Field);
        frame.add(new JLabel("+"));
        frame.add(num2Field);
        frame.add(sumarButton);
        frame.add(new JLabel("="));
        frame.add(resultadoField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraSuma());
    }
}