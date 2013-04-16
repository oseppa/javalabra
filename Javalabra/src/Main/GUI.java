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
    private JTextArea teksti;
    private JButton etene;
    private JScrollPane rullaus;

    public GUI() {

        kertoja = new Tarinankertoja();

        teksti = new JTextArea();
        teksti.setEditable(false);
        teksti.setText(kertoja.kerroTarina());
        teksti.setLineWrap(true);

        rullaus = new JScrollPane(teksti);
        rullaus.setPreferredSize(new Dimension(320,180));
        rullaus.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        etene = new JButton("Seuraava");

        etene.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent tapahtuma) {
                teksti.setText(teksti.getText() + "\n\n" + kertoja.kerroTarina());
            }
        });
        setLayout(new BorderLayout());

        add(rullaus, BorderLayout.CENTER);
        add(etene, BorderLayout.SOUTH);
    }

    public static void main(String args[]) {
        GUI ikkuna = new GUI();
        ikkuna.setTitle("GUI");
        ikkuna.pack();
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ikkuna.setVisible(true);
    }
}
