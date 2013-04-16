package Main;

/**
 * Ohjelman käyttöliittymä
 *
 * @author Olli
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {

    private Tarinankertoja kertoja;
    private JTextField teksti;
    private JButton etene;

    public GUI() {

        kertoja = new Tarinankertoja();

        teksti = new JTextField();
        teksti.setEditable(false);
        teksti.setText(kertoja.kerroTarina());

        etene = new JButton("Seuraava");

        etene.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent tapahtuma) {
                teksti.setText(kertoja.kerroTarina());
            }
        });
        setLayout(new GridLayout(2, 1));

        add(teksti);
        add(etene);

    }

    public static void main(String args[]) {
        GUI ikkuna = new GUI();
        ikkuna.setTitle("GUI");
        ikkuna.pack();
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ikkuna.setVisible(true);
    }
}
