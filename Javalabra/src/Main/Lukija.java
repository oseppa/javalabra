package Main;

import java.io.File;
import java.util.Scanner;

public class Lukija {

    private int lukumaara;
    private int kappale;
    private File tiedosto;
    public static Scanner lukija;
    public static File eka = new File("Eka.txt");
    public static File toka = new File("Toka.txt");
    public static File kolmas = new File("Kolmas.txt");
    public String[] Taulu;

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
    
    public static void main(String[] args){
        Lukija lukija = new Lukija();
        int a = lukija.laskeKappale(eka);
        File ekaTesti = new File("Testi1.txt");
        System.out.println(a);
        String b = lukija.lueKappale(eka, 1);
        System.out.println(b);
        String c = lukija.lueKappale(ekaTesti, 0);
    }
}
