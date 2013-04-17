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
    private int laskuri;

    public GUI() {

        kertoja = new Tarinankertoja();

        laskuri = 0;

        teksti = new JTextArea();
        teksti.setEditable(false);
        teksti.setLineWrap(true);

        rullaus = new JScrollPane(teksti);
        rullaus.setPreferredSize(new Dimension(640, 320));
        rullaus.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        etene = new JButton("Seuraava");

        etene.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent tapahtuma) {
                if (laskuri == 0) {
                    teksti.setText(kertoja.kerroTarina());
                    laskuri++;
                } else if (laskuri < 3) {
                    teksti.setText(teksti.getText() + "\n\n" + kertoja.kerroTarina());
                    laskuri++;
                } else {
                    teksti.setText(kertoja.kerroTarina());
                    laskuri = 1;
                }
            }
        });
        setLayout(new BorderLayout());

        add(rullaus, BorderLayout.CENTER);
        add(etene, BorderLayout.SOUTH);
    }

    public void aloita() {
        GUI ikkuna = new GUI();
        ikkuna.setTitle("GUI");
        ikkuna.pack();
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ikkuna.setVisible(true);
    }
}
