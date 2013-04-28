package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Ohjelman käyttöliittymä
 *
 * @author Olli
 */
public class GUI extends JFrame {

    /**
     * Logiikka, jota GUI toteuttaa
     *
     * @see Main.Tarinankertoja
     */
    private Tarinankertoja kertoja;
    private JTextArea teksti;
    private JButton etene;
    private JButton nollaus;
    /**
     * Kenttä, jolla saadaan teksti-ikkunalle rulla tarvittaessa
     */
    private JScrollPane rullaus;
    /**
     * Apumuuttuja, jolla saadaan nappulat toimimaan halutulla tavalla
     */
    private int laskuri;

    /**
     * Käyttöliittymän konstruktori
     */
    public GUI() {

        kertoja = new Tarinankertoja();

        laskuri = 0;

        teksti = new JTextArea();
        teksti.setEditable(false);
        teksti.setLineWrap(true);
        teksti.setWrapStyleWord(true);

        rullaus = new JScrollPane(teksti);
        rullaus.setPreferredSize(new Dimension(640, 320));
        rullaus.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        etene = new JButton("Seuraava");

        etene.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent tapahtuma) {
                if (laskuri == 0) {
                    teksti.setText(kertoja.kerroTarina());
                    laskuri++;
                } else if (laskuri < 4) {
                    teksti.setText(teksti.getText() + "\n\n" + kertoja.kerroTarina());
                    laskuri++;
                } else {
                }
            }
        });

        nollaus = new JButton("Uudestaan!");

        nollaus.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent tapahtuma) {
                kertoja = new Tarinankertoja();
                laskuri = 0;
                teksti.setText(null);
            }
        });

        JPanel nappulat = new JPanel(new GridLayout(2, 1));
        nappulat.setPreferredSize(new Dimension(640, 320 / 3));
        nappulat.add("North", etene);
        nappulat.add("South", nollaus);

        this.setLayout(new BorderLayout());
        this.add(rullaus);
        this.add("South", nappulat);
    }

    /**
     * Metodi, jolla GUI:n voi käynnistää
     */
    public void aloita() {
        GUI ikkuna = new GUI();
        ikkuna.setTitle("GUI");
        ikkuna.pack();
        ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ikkuna.setVisible(true);
    }
}