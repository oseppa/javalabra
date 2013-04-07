package Main;

import java.io.File;
import java.util.Scanner;

public class Lukija {

    private int lukumaara;
    private int kappale;
    private File tiedosto;
    public static Scanner lukija;
    private static File eka = new File("Eka.txt");
    private static File toka = new File("Toka.txt");
    private static File kolmas = new File("Kolmas.txt");
    private String[] Taulu;

    public String lueKappale(File tiedosto, int kappale) {
        this.tiedosto = tiedosto;
        this.kappale = kappale;
        try {
            lukija = new Scanner(tiedosto);
        } catch (Exception e) {
            System.out.println("Tiedostoa ei löytynyt " + e.getMessage());
        }
        Taulu = lukija.nextLine().split(":");
        String EkaKappale = Taulu[kappale];
        lukija.close();
        return EkaKappale;
    }

    public int laskeKappale(File tiedosto) {
        this.tiedosto = tiedosto;
        try {
            lukija = new Scanner(tiedosto);
        } catch (Exception e) {
            System.out.println("Tiedostoa ei löytynyt " + e.getMessage());
        }
        Taulu = lukija.nextLine().split(":");
        lukumaara = Taulu.length;
        lukija.close();
        return lukumaara;
    }
}
