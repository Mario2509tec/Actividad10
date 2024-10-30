import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class miVentana extends JFrame {
    private JPanel miPanel;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSumar;
    private JTextField txtSuma;
    private JTextField txtDiv;
    private JTextField txtMulti;


    public miVentana() {
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum1.setBackground(Color.GRAY);
            }
        });
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                txtNum1.setBackground(Color.WHITE);
            }

        });
        txtNum2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                txtNum2.setBackground(Color.GRAY);
            }
        });
        txtNum2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                txtNum2.setBackground(Color.WHITE);
            }
        });
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble( txtNum1.getText());
                double b = Double.parseDouble( txtNum2.getText());
                double suma = a + b;
                double multi = a * b;
                double div = a / b;

                txtSuma.setText( "La Suma es:" + String.valueOf(suma));
                txtMulti.setText( "La Multiplicación es:" + String.valueOf(multi));
                txtDiv.setText( "La Division es:" + String.valueOf(div));
            }
        });
    }

    public static void main(String[] args) {
        miVentana v = new miVentana();
        v.setContentPane(v.miPanel);
        v.setSize(500,500);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
