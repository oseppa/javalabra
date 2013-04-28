package Main;

import Main.GUI;

/**
 * Luokka, joka käynnistää ohjelman
 *
 * @author Olli
 */
public class Main {

    /**
     * Metodi, joka käynnistää ohjelman
     *
     * @param args
     */
    public static void main(String[] args) {
        GUI uusi = new GUI();
        uusi.aloita();
    }
}