package Main;

import java.io.File;
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
    public static Scanner lukija;
    public static File eka = new File("Eka.txt");
    public static File toka = new File("Toka.txt");
    public static File kolmas = new File("Kolmas.txt");
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
        } catch (Exception e) {
            System.out.println("Tiedostoa ei löytynyt " + e.getMessage());
        }
        if (!lukija.hasNextLine()) {
            return "Tiedosto " + tiedosto + " on tyhjä.";
        }
        Taulu = lukija.nextLine().split(":");
        String EkaKappale = Taulu[kappale];

        lukija.close();
        return EkaKappale;
    }

    /**
     * Metodi laskaa, kuinka monta kappaletta tiedostossa on
     *
     * @param tiedosto tiedosto, josta metodi laskee kappaleita
     * @return kappaleiden lukumäärä
     */
    public int laskeKappale(File tiedosto) {
        this.tiedosto = tiedosto;
        try {
            lukija = new Scanner(tiedosto);
        } catch (Exception e) {
            System.out.println("Tiedostoa ei löytynyt " + e.getMessage());
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
