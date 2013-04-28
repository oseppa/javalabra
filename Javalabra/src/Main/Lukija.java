package Main;

import java.io.*;
import java.util.Scanner;

/**
 * Luokka, jolla käsitellään tiedostoja
 *
 * @author Olli
 */
public class Lukija {

    private int lukumaara;
    private int kappale;
    private File tiedosto;
    private Scanner lukija;
    /**
     * Ensimmäinen tekstitiedosto, jota ohjelma käsittelee
     */
    public File eka = new File("Eka.txt");
    /**
     * Toinen tekstitiedosto, jota ohjelma käsittelee
     */
    public File toka = new File("Toka.txt");
    /**
     * Kolmas tekstitiedosto, jota ohjelma käsittelee
     */
    public File kolmas = new File("Kolmas.txt");
    /**
     * Neljas tekstitiedosto, jota ohjelma käsittelee
     */
    public File neljas = new File("Neljas.txt");
    /**
     * Taulu, johon tekstitiedostot luetaan käsittelyä varten
     */
    public String[] Taulu;

    /**
     * Luokan konstruktori
     */
    public Lukija() {
    }

    /**
     * Metodi lukee osia tiedostoista
     *
     * @param tiedosto tiedosto, josta metodi lukee tekstiä
     * @param kappale osa, jonka teksti lukee
     * @return palauttaa tekstin pätkän
     */
    public String lueKappale(File tiedosto, int kappale) {
        this.tiedosto = tiedosto;
        this.kappale = kappale;
        try {
            lukija = new Scanner(tiedosto);
        } catch (FileNotFoundException e) {
            return "Tiedostoa " + tiedosto + " ei löytynyt.";
        }
        if (!lukija.hasNextLine()) {
            return "Tiedosto " + tiedosto + " on tyhjä.";
        }
        Taulu = lukija.nextLine().split(":");
        String Kappale = Taulu[kappale];
        lukija.close();

        return Kappale;
    }

    /**
     * Metodi laskee, kuinka monta kappaletta tiedostossa on
     *
     * @param tiedosto tiedosto, josta metodi laskee kappaleita
     * @return kappaleiden lukumäärä
     */
    public int laskeKappale(File tiedosto) {
        this.tiedosto = tiedosto;
        try {
            lukija = new Scanner(tiedosto);
        } catch (FileNotFoundException e) {
            return -1;
        }
        if (!lukija.hasNextLine()) {
            return -1;
        }
        Taulu = lukija.nextLine().split(":");
        lukumaara = Taulu.length;
        lukija.close();

        return lukumaara;
    }
}